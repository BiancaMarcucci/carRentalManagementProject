package com.carRentalProject;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Customers {
    private ArrayList<Person> customersList;
    private Person newCustomer;
    private CarsListsDB carsDB;

    public Customers(CarsListsDB carsDB) {
        this.customersList = new ArrayList<>();
        this.newCustomer = new Person();
        this.carsDB=carsDB;
    }

////////////////////////////////BEHAVIOURS/////////////////////////////////////////////////////////////////////////////
 /*
 * 1-EXECUTE PERSON CLASS METHOD TO ASK CUSTOMER DETAILS.
 * 2-SAVE PERSON IN COSTUMER LIST
 * 3-print available cars list
 * 4-ask which car they want
 * 5- remove car from available list, change its status to RENTED and then move it to rented cars lists
 * 6- ADD METHOD TO REMOVE A COSTUMER FROM LIST
 * */


///////////////////////////////////////// NEW CUSTOMER WANTS TO RENT //////////////////////////////////////////////////
    public void greetAndSaveNewCustomer(){
        System.out.println("\nWelcome! My colleague told me you need a car right? I am Jim and will help you find the perfect car for you!\n");
        System.out.println("First of all, I will ask your details....\n");
        this.newCustomer.askDetails();
        System.out.println("Ok, I will now add you to the list "+this.newCustomer.getFirstName()+" !");
        this.customersList.add(this.newCustomer);
    }
    /////// NEED TO SHOW POSSIBLE CARS AND CREATE A WAY TO MAKE USER SELECT CAR THEY WANT, THEN CHANGE CAR STATUS AND LIST
    public void showAvailableCarsAndAskToChoose () {

        this.carsDB.listAvailableCars();
        Integer chosenCar = this.askUserToChooseCar();
        Boolean stillSearching = true;

        for (int i = 0; i < this.carsDB.getAvailableCars().size(); i++) {

            if (chosenCar.equals(this.carsDB.getAvailableCars().get(i).getId())) {
                System.out.println("Oh you chose to go for a " + this.carsDB.getAvailableCars().get(i).getMake() + "! Good choice!");
                this.carsDB.setRented(this.carsDB.getAvailableCars().get(i));
                break;
            } else {
                System.out.println("Could not find the car you wanted, are you sure you gave me the right Identification code?");
            }
        }

        Arraylist<Car> holdingChosenCar= this.carsDB.getAvailableCars().stream().filter(avCar->avCar.getId().equals(chosenCar)).collect(Collectors.toList());
        // ourholdinlist = availablecarslist.stream().filter(availablecar->availablecar.getID().equals(chosenCar)).collect(Collectors.toList());
        // merge ourholdinglist with rented list rentedlist.addAll(ourholdinglist)





    }
    ////////// method to take user input for which car they want, used in showAvailableCarsAndAskToChoose method
    public Integer askUserToChooseCar(){
        Scanner askWhichCar=new Scanner(System.in);
        System.out.println("\nSo any that you like? Choose the car and then tell me its Identification Code: ");
        Integer customerChoice=askWhichCar.nextInt();
        return customerChoice;
    }

///////////////////////////////////////// OLD CUSTOMER WANTS TO RETURN CAR //////////////////////////////////////////////////

// ask user which car wants to return -----> ie ask either  id of car  or costumer id
    // implement changing status of rented car to available
    public void returnCar(){
        System.out.println("Oh Welcome back then! Which is the car that you want to return? I need the Car Identification Code");
        Scanner askReturn =new Scanner(System.in);
        Integer customerReturns=askReturn.nextInt();

        for (int i = 0; i <this.carsDB.getRentedCars().size() ; i++) {
            if (customerReturns.equals(this.carsDB.getRentedCars().get(i).getId())){
                System.out.println("Perfect, thank you for returning "+this.carsDB.getRentedCars().get(i).getMake()+"! Have a good day!");
                this.carsDB.setAvailable(this.carsDB.getRentedCars().get(i));
                break;
            }
        }
        System.out.println("Could not find the car you want to return, are you sure you gave me the right Identification code?");
        }





////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    public ArrayList<Person> getCustomersList() {
        return customersList;
    }

    public void setCustomersList(ArrayList<Person> customersList) {
        this.customersList = customersList;
    }

    public Person getNewCustomer() {
        return newCustomer;
    }

    public void setNewCustomer(Person newCustomer) {
        this.newCustomer = newCustomer;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "customersList=" + customersList +
                '}';
    }
}
// add also asking for identification number of costumer to then remove it from list when he returns car
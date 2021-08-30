package com.carRentalProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Customers extends Person {
    private ArrayList<Person> customersList;
    private Person newCustomer;
    private CarsManagement carsDB;

    public Customers(CarsManagement carsDB) {
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

        Boolean stillSearching= true;
        while(stillSearching){
            this.carsDB.listAvailableCars();
            Integer chosenCar = this.askUserToChooseCar();
            List<Car> holdingChosenCar= this.carsDB.getAvailableCars()
                    .stream()
                    .filter(avCar->avCar.getId().equals(chosenCar))
                    .collect(Collectors.toList());
            if (!holdingChosenCar.isEmpty()){
                System.out.println("Oh you chose to go for a " + holdingChosenCar.get(0).getMake() + "! Good choice!");
                this.carsDB.setRented(holdingChosenCar.get(0),this.newCustomer);
                //this.carsDB.getRentedCars().addAll(holdingChosenCar);
                stillSearching=false;
            }else{
                System.out.println("Could not find the car you wanted, are you sure you gave me the right Identification code?");
            }
        }
    }
    ////////// method to take user input for which car they want, used in showAvailableCarsAndAskToChoose method
    public Integer askUserToChooseCar(){
        Scanner askWhichCar=new Scanner(System.in);
        System.out.println("\nSo any that you like? Choose the car and then tell me its Identification Code: ");
        Integer customerChoice=askWhichCar.nextInt();
        return customerChoice;
    }
//////////// same but to return car////////////////////////////////////////////////////////
    public Integer askUserToGiveCar(){
        Scanner askWhichReturn=new Scanner(System.in);
        System.out.println("\nSo Which car are you returning? Can you please tell me its Identification Code? ");
        Integer customerReturn=askWhichReturn.nextInt();
        return customerReturn;
    }

///////////////////////////////////////// OLD CUSTOMER WANTS TO RETURN CAR //////////////////////////////////////////////////

// ask user which car wants to return -----> ie ask either  id of car  or costumer id
    // implement changing status of rented car to available
    public void returnCar(){
        /////IF TIME ADD ASKING FOR USER ID , BUT NOT NECESSARY.
        System.out.println("\nOh Welcome back then! Which is the car that you want to return? I need the Car Identification Code");


        Boolean stillS= true;
        while(stillS){
            this.carsDB.listRentedCars();
            Integer returningCar = this.askUserToGiveCar();
            //////Does not get to execute this!
            List<Car> holdingReturningCar= this.carsDB.getRentedCars()
                    .stream()
                    .filter(avCar->avCar.getId().equals(returningCar))
                    .collect(Collectors.toList());
            if (!holdingReturningCar.isEmpty()){
                System.out.println("You successfully returned our " + holdingReturningCar.get(0).getMake() + "! Thank you for renting a car with us!");
                this.carsDB.setAvailable(holdingReturningCar.get(0));


                //this.carsDB.getAvailableCars().addAll(holdingReturningCar);
                stillS=false;
            }else{
                System.out.println("Could not find the car you rented, are you sure you gave me the right Identification code?");
            }
        }
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
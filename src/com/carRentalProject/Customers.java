package com.carRentalProject;

import java.util.ArrayList;
import java.util.Scanner;

public class Customers {
    private ArrayList<Person> customersList;
    private Person newCustomer;

    public Customers() {
        this.customersList = new ArrayList<>();
        this.newCustomer = new Person();
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
    public void showAvailableCars (){
    CarsListsDB allCars=new CarsListsDB();
    allCars.listAvailableCars();

    Integer chosenCar= this.askUserToChooseCar();
        for (int i = 0; i <allCars.getAvailableCars().size() ; i++) {

            if (chosenCar.equals(allCars.getAvailableCars().get(i).getId())){
                System.out.println("Oh you chose to go for a "+allCars.getAvailableCars().get(i).getMake()+"! Good choice!");


            }

        }


    }
    ////////// NEED TO ASK WHICH ONE THEY WANT///////////////////////
    public Integer askUserToChooseCar(){
        Scanner askWhichCar=new Scanner(System.in);
        System.out.println("\nSo any that you like? Choose the car and then tell me its Identification Code: ");
        Integer customerChoice=askWhichCar.nextInt();
        askWhichCar.close();
        return customerChoice;

    }

///////////////////////////////////////// OLD CUSTOMER WANTS TO RETURN CAR //////////////////////////////////////////////////






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
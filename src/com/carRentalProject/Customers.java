package com.carRentalProject;

import java.util.ArrayList;

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
 * */

    public void greetAndSaveNewCustomer(){
        System.out.println("Welcome! My colleague told me you need a car right? I am Jim and will help you find the perfect car for you!\n");
        System.out.println("First of all, I will ask your details....\n");
        this.newCustomer.askDetails();
        System.out.println("Ok, I will now add you to the list "+this.newCustomer.getFirstName()+" !");
        this.customersList.add(this.newCustomer);

    }







////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    public ArrayList<Person> getCustomersList() {
        return customersList;
    }

    public void setCustomersList(ArrayList<Person> customersList) {
        this.customersList = customersList;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "customersList=" + customersList +
                '}';
    }
}
// add also asking for identification number of costumer to then remove it from list when he returns car
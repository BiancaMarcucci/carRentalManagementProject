package com.carRentalProject;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class Person {

    private String firstName ;
    private String lastName;
    private Integer age;
    private Integer idNumber; // we set it for costumer

    public Person() {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age; ////maybe remove to simplify
        this.idNumber= idNumber;
    }
    ///////////////////////////////BEHAVIOURS////////////////////////////////////////////////////////////////////////
    /* 1-Ask details to costumer and save them, assign a costumer idNumber, for then find details in customers list.
    2- NEED METHOD  TO GENERATE RANDOM PERSON, FOR TESTING PURPOSES (OR TO PRETEND THAT THERE ARE MORE COSTUMERS THAN JUST THE USER)
    - if time ask tel num, but not necessary
    *
    * */
    public void askDetails(){
        // implement methods for each specific detail
        this.askFirstName();
        this.askLastName();
        this.askAge();
        this.assignIdNum();
    }
    //////// ASK FIRST NAME //////////////////////////////////////////////////////////////////////////////////////////////
    public void askFirstName(){
        Scanner askFName= new Scanner(System.in);
        System.out.println("\nWhat is your First Name?");
        String userFirstName = askFName.nextLine();

        System.out.println("Let me write it....'"+userFirstName+"'.....\n");
        this.firstName=userFirstName;
    }
    ///////// ASK LAST NAME //////////////////////////////////////////////////////////////////////////////////////////////
    public void askLastName(){
        Scanner askLName= new Scanner(System.in);
        System.out.println("\nWhat is your Last Name?");
        String userLastName = askLName.nextLine();

        System.out.println("Let me write it....'"+userLastName+"'.....\n");
        this.lastName=userLastName;
    }
    ///////// ASK AGE //////////////////////////////////////////////////////////////////////////////////////////////////////
    public void askAge(){
        Scanner askAge= new Scanner(System.in);
        System.out.println("\nWhat is your age?");
        Integer userAge = askAge.nextInt();
        System.out.println("Let me write it....'"+userAge+"'.....\n");

        this.age=userAge;
    }
    ///////// ASSIGN ID NUMBER ////////////////////////////////////////////////////////////////////////////////////////////
    public void assignIdNum(){
        System.out.println("We are assigning you to an ID number, so that when you will return the car, you can just give it to us and we can find you in the database!");
        this.idNumber= ThreadLocalRandom.current().nextInt(0, 500 + 1);
        System.out.println("OK, so, your ID number is "+this.idNumber+", make sure you do not forget it! ");
    }


    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getCustomerIdNumber() {
        return idNumber;
    }

    public void setCustomerIdNumber(Integer idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", idNumber=" + idNumber +
                '}';
    }
}
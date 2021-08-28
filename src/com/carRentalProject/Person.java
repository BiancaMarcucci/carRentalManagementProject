package com.carRentalProject;

import java.time.LocalDate;
import java.util.Scanner;


public class Person {

    private String firstName ;
    private String lastName;
    private Integer age;
    private Integer idNumber; // we set it for costumer

    public Person(String firstName, String lastName, String gender, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;

        this.age = age; ////maybe remove to simplify
    }
    ///////////////////////////////BEHAVIOURS////////////////////////////////////////////////////////////////////////
    /* 1-Need to ask details to costumer and save them, assign a costumer idNumber, for then find details in customers list.
    *
    * */
    public void askDetails(){
        // implement methods for each specific detail
    }

    public void askFirstName(String userFirstName){
        Scanner askFName= new Scanner(System.in);
        System.out.println("\nWhat is your First Name?");
        userFirstName = askFName.nextLine();
        System.out.println("Let me write it....'"+userFirstName+"'.....\n");
        this.firstName=userFirstName;
    }
    public void askLastName(String userLastName){
        Scanner askLName= new Scanner(System.in);
        System.out.println("\nWhat is your First Name?");
        userLastName = askLName.nextLine();
        System.out.println("Let me write it....'"+userLastName+"'.....\n");
        this.lastName=userLastName;
    }



    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer userAge) {
        this.age = userAge;
    }

    @Override
    public String toString() {
        return "personClass{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}


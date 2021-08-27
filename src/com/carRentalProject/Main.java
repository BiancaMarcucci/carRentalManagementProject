package com.carRentalProject;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       /* testing methods
        garage.listAvailableCars();

        garage.setRented(test);
        System.out.println(test);
        garage.switchStatusList(test);
        garage.listRentedCars();
        garage.listAvailableCars();
        */
        // Are you staff member or client? Use a while(true) loop???
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, are you STAFF or CLIENT?");

        String answer = scanner.nextLine(); // Either Staff or Client

        //IF STAFF
        System.out.println("STAFF OPTIONS: ");
        System.out.println("- To ADD a car press 1 ");
        System.out.println("- To REMOVE a car press 2");
        System.out.println("- To get a list of cars currently AVAILABLE to rent press 3");
        System.out.println("- To get a list of cars currently RENTED out press 4");
        System.out.println("- To return to the main menu press 5");

        int staffAns = scanner.nextInt();

        //IF CLIENT
        System.out.println("CLIENT OPTIONS: ");
        System.out.println("- To BOOK a car press 1");
        System.out.println("- To RETURN a car press 2");
        System.out.println("- To return to the main menu press 3");

        int clientAns = scanner.nextInt();

    }
}

/*
* Print menu with all options that user can choose
*
* Are you staff member or client?
* STAFF CHOICES:
* -add car with price
* -remove car
* -give list of available cars to rent
* -give list of rented cars
*
*
*
* CLIENT CHOICES:
*-book a car
*-return a car
*
*
*
* take input from user for next action
*
*
*
*
*
*
*
* */
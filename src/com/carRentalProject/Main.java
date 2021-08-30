package com.carRentalProject;

/* TO TRY LIST!!!
* ---ASK----> YOU HERE TO BOOK, RETURN A CAR OR GIVE US A CAR TO RENT?----COULD CREATE CLASSES FOR EACH OPTION (IT WOULD IMPLEMENT THE CLASSES AND METHODS WE ALREADY CREATED)
* IF BOOK: COULD CREATE A CUSTOMER CLASS TO KEEP A LIST OF ALL COSTUMERS WHO RENTED A CAR! (BUSAYO'S IDEA), WHEN A CAR IS BOOKED, WILL BE MOVE TO RENTED LIST. SHOW THE LIST OF RENTABLE CARS!
* IF RETURN: REMOVE COSTUMER FROM LIST AND MOVE THE RENTED CAR TO AVAILABLE LIST (AFTER CHANGING RENTED STATUS TO AVAILABLE)
* IF GIVE US A CAR: ADD THE CAR TO AVAILABLE CARS TO RENT
* */


import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        CarsManagement garage=new CarsManagement();
        // ASK IF STAFF OR CUSTOMER

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nHello! Who are you? select one of the options below: ".toUpperCase(Locale.ROOT));
        System.out.println("Press 1 for CUSTOMER");
        System.out.println("Press 2 for STAFF");
        String staffOrCustomer= scanner.nextLine();
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // IF CUSTOMER
        //want to rent a car, if yes show list of cars etc
        //want to return a car



////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // IF STAFF

        if (staffOrCustomer.equalsIgnoreCase("2")) {
            // want to see list of rented and available cars?
            // want to add/remove a car?

            //use CARSMANAGEMENT
            Boolean staffStaffing = true;
            while (staffStaffing) {
                Scanner scanStaff = new Scanner(System.in);
                System.out.println("Select one of the following options:".toUpperCase(Locale.ROOT));
                System.out.println("Press 1 to see list of available cars");
                System.out.println("Press 2 to see list of rented cars");
                System.out.println("Press 3 to add new car");
                System.out.println("Press 4 to remove a car");
                String staffOption = scanStaff.nextLine();
                switch (staffOption) {
                    case "1":
                        System.out.println("\nYou chose to see the list of available cars!");
                        garage.listAvailableCars();
                        break;
                    case "2":
                        System.out.println("\nYou chose to see the list of rented cars!");
                        garage.listRentedCars();
                        break;
                    case "3":
                        System.out.println("\nYou chose to ADD a new car!");
                        garage.addNewCarToAvailable();
                        break;
                    case "4":
                        System.out.println("\nYou chose to REMOVE a car!");
                        garage.removeCarFromAvailable();
                        break;
                    default:
                        System.out.println("OPTION NOT RECOGNISED! Please select a number between 1 and 4");
                }
                Scanner staffKeepWorking= new Scanner(System.in);
                System.out.println("\nWould you like to do anything else? (y/n)");
                String keepAskingStaffOption = staffKeepWorking.nextLine();
                if(!keepAskingStaffOption.equalsIgnoreCase("y")){
                    System.out.println("Exiting STAFF MENU...");
                    staffStaffing=false;
                }else{
                    System.out.println("ACCESSING STAFF POSSIBLE OPTIONS AGAIN!");
                }

            }
        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
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
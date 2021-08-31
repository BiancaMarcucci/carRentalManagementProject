package com.carRentalProject;

import java.util.Locale;
import java.util.Scanner;

public class AccessMenu {
    public void Menu (CarsManagement garage, Customers customer) {
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // ASK IF STAFF OR CUSTOMER
        Boolean startingMenu = true;
        while (startingMenu) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nHello! Who are you? select one of the options below: ".toUpperCase(Locale.ROOT));
            System.out.println("Press 1 for CUSTOMER");
            System.out.println("Press 2 for STAFF");
            System.out.println("Press 3 to EXIT");
            String staffOrCustomer = scanner.nextLine();
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            // IF CUSTOMER
            //want to rent a car, if yes show list of cars etc
            //want to return a car
            switch (staffOrCustomer) {
                case "1" -> {
                    // USE CUSTOMERS
                    Boolean customerCustoming = true;
                    while (customerCustoming) {
                        Scanner scanCustomer = new Scanner(System.in);
                        System.out.println("Welcome! Select one of the following options:".toUpperCase(Locale.ROOT));
                        System.out.println("Press 1 to RENT a car");
                        System.out.println("Press 2 to RETURN a car");
                        System.out.println("Press 3 to EXIT");
                        String customerOption = scanCustomer.nextLine();
                        switch (customerOption) {
                            case "1" -> {
                                System.out.println("\nYou chose to RENT a car!");
                                customer.greetAndSaveNewCustomer();
                                customer.showAvailableCarsAndAskToChoose();
                            }
                            case "2" -> {
                                System.out.println("\nYou chose to RETURN a car!");
                                customer.returnCar();
                            }
                            case "3" -> {
                                System.out.println("\nYou chose to EXIT!");
                                customerCustoming = false;
                            }
                            default -> System.out.println("\nOPTION NOT RECOGNISED! Please select a number between 1 and 3");
                        }
                        Scanner customerAnythingElse = new Scanner(System.in);
                        System.out.println("\nWould you like to do anything else? (y/n)");
                        String keepAskingStaffOption = customerAnythingElse.nextLine();
                        if (!keepAskingStaffOption.equalsIgnoreCase("y")) {
                            System.out.println("Exiting CUSTOMER MENU...");
                            customerCustoming = false;
                        } else {
                            System.out.println("ACCESSING CUSTOMER POSSIBLE OPTIONS AGAIN!");
                        }
                    }

                }


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                // IF STAFF

                case "2" -> {
                    // want to see list of rented and available cars?
                    // want to add/remove a car?
                    // want to see customers lists?

                    //use CARSMANAGEMENT
                    Boolean staffStaffing = true;
                    while (staffStaffing) {
                        Scanner scanStaff = new Scanner(System.in);
                        System.out.println("Select one of the following options:".toUpperCase(Locale.ROOT));
                        System.out.println("Press 1 to see list of available cars");
                        System.out.println("Press 2 to see list of rented cars");
                        System.out.println("Press 3 to add new car");
                        System.out.println("Press 4 to remove a car");
                        System.out.println("Press 5 to EXIT");
                        String staffOption = scanStaff.nextLine();
                        switch (staffOption) {
                            case "1" -> {
                                System.out.println("\nYou chose to see the list of available cars!");
                                garage.listAvailableCars();
                            }
                            case "2" -> {
                                System.out.println("\nYou chose to see the list of rented cars!");
                                garage.listRentedCars();
                            }
                            case "3" -> {
                                System.out.println("\nYou chose to ADD a new car!");
                                garage.addNewCarToAvailable();
                            }
                            case "4" -> {
                                System.out.println("\nYou chose to REMOVE a car!");
                                garage.removeCarFromAvailable();
                            }
                            case "5" -> {
                                System.out.println("\nBye!");
                                staffStaffing = false;
                            }
                            default -> System.out.println("\nOPTION NOT RECOGNISED! Please select a number between 1 and 4");
                        }
                        Scanner staffKeepWorking = new Scanner(System.in);
                        System.out.println("\nWould you like to do anything else? (y/n)");
                        String keepAskingStaffOption = staffKeepWorking.nextLine();
                        if (!keepAskingStaffOption.equalsIgnoreCase("y")) {
                            System.out.println("Exiting STAFF MENU...");
                            staffStaffing = false;
                        } else {
                            System.out.println("ACCESSING STAFF POSSIBLE OPTIONS AGAIN!");
                        }

                    }

                }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                case "3" -> {
                    System.out.println("Exiting program....");
                    startingMenu=false;
                }
                default -> System.out.println("\nOPTION NOT RECOGNISED! Please select a number between 1 and 3");
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            }
            // REPEAT THE WHOLE THING
//            Scanner keepMenuRunning = new Scanner(System.in);
//            System.out.println("\nWant to go back to MAIN MENU? (y/n)");
//            String keepAskingStaffOption = keepMenuRunning.nextLine();
//            if (keepAskingStaffOption.equalsIgnoreCase("n")) {
//                System.out.println("EXITING PROGRAM...");
//                startingMenu = false;
//            } else {
//                System.out.println("ACCESSING MAIN MENU AGAIN!\n");
//                Menu(garage, customer);
//            }
        }
    }

}
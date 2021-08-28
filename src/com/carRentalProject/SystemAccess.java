package com.carRentalProject;

import java.util.Scanner;

public class SystemAccess {
    private CarRentalDB garage = new CarRentalDB();

    // Create initial database of cars
    static void existingCarDB() {
        // Create Cars
        Car test= new Car(1, "Toyota", "001A");
        Car test2= new Car(2, "Ford", "002B");
        Car test3= new Car(3, "Ferrari", "003C");
        Car test4= new Car(4, "Fiat", "004D");
        Car test5= new Car(5, "Lamborghini", "005E");

        // Add Cars to our rental management system
        this.garage.addCar(test,4.5);
        this.garage.addCar(test2,5.5);
        this.garage.addCar(test3,6.5);
        this.garage.addCar(test4,7.5);
        this.garage.addCar(test5,8.5);
    }
    //Main menu
    static void mainMenu() {
        // Are you staff member or client?
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, are you STAFF or CLIENT?");

        String answer = scanner.nextLine(); // Either Staff or Client
        // if staff run staff menu
        if (answer.toLowerCase().equals("staff")) {
            staffMenu();
        }
        //if client run client menu
        else if (answer.toLowerCase().equals("client")){
            clientMenu();
        }
        // else say didn't understand input please type and run mainMenu again
        else {
            System.out.println("I'm sorry, I didn't understand that input - please try again");
            mainMenu();
        }
    }
    static void staffMenu() {
        System.out.println("STAFF OPTIONS: ");
        System.out.println("- To ADD a car press 1 ");
        System.out.println("- To REMOVE a car press 2");
        System.out.println("- To get a list of cars currently AVAILABLE to rent press 3");
        System.out.println("- To get a list of cars currently RENTED out press 4");
        System.out.println("- To return to the main menu press 5");
        System.out.println("- To end program type esc");

        Scanner scanner = new Scanner(System.in);
        int staffAns = scanner.nextInt();
        //big if else statement calling rental db methods
        if (staffAns == 1){
            //Add Car
            createNewCar();
            System.out.println("You have successfully created a new car!");
        } else if (staffAns == 2) {
            // Remove car
            System.out.println("REMOVE CAR: ");
            System.out.println("Enter car id number: ");
            int carID = scanner.nextInt();
            this.garage.removeCar(carID);
            System.out.println("You have successfully removed car ID:" + carID);
        } else if (staffAns == 3) {
            // Available cars list
            this.garage.listAvailableCars();
        } else if (staffAns == 4) {
            // Rented cars list
            this.garage.listRentedCars();
        } else if (staffAns==5) {
            mainMenu();
        } else {
            System.exit(0);
        }
    }
    static void clientMenu() {
        System.out.println("CLIENT OPTIONS: ");
        System.out.println("- To BOOK a car press 1");
        System.out.println("- To RETURN a car press 2");
        System.out.println("- To return to the main menu press 3");
        System.out.println("- To end program type esc");

        Scanner scanner = new Scanner(System.in);
        int clientAns = scanner.nextInt();
        //big if else statement calling client methods
    }
    static void createNewCar(){
        System.out.println("ADD NEW CAR:");
        Car newCar = new Car();
        Scanner scanner = new Scanner(System.in);

        //get id
        System.out.println("Enter unique id: ");
        int carID = scanner.nextInt();
        newCar.setId(carID);
        // get make
        System.out.println("Enter Car Make: ");
        String carMake = scanner.nextLine();
        newCar.setMake(carMake);
        //get reg number
        System.out.println("Enter Registration Number: ");
        String carReg = scanner.nextLine();
        newCar.setRegNum(carReg);
        //get price and add to available cars
        System.out.println("Enter daily rental price: ");
        double carPrice = scanner.nextDouble();
        this.garage.addcar(newCar, carPrice);

    }

}

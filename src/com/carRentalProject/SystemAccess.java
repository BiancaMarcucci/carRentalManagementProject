package com.carRentalProject;

import java.util.Scanner;

public class SystemAccess {

    // Create initial database of cars
    static void existingCarDB() {
        // Create Cars
        Car test= new Car(1, "Toyota", "001A");
        Car test2= new Car(2, "Ford", "002B");
        Car test3= new Car(3, "Ferrari", "003C");
        Car test4= new Car(4, "Fiat", "004D");
        Car test5= new Car(5, "Lamborghini", "005E");

        // Add Cars to our rental management system
        CarRentalDB garage = new CarRentalDB();
        garage.addCar(test,4.5);
        garage.addCar(test2,5.5);
        garage.addCar(test3,6.5);
        garage.addCar(test4,7.5);
        garage.addCar(test5,8.5);
    }
    //Main menu
    static void mainMenu() {
        // Are you staff member or client?
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, are you STAFF or CLIENT?");

        String answer = scanner.nextLine(); // Either Staff or Client
    }

}

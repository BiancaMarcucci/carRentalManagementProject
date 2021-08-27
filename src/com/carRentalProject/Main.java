package com.carRentalProject;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Car test= new Car(1, "toyota", "001A", 3.5,RentedStatus.AVAILABLE );
        CarRentalDB garage = new CarRentalDB();
        garage.addCar(test,4.5);
        garage.listAvailableCars();

        garage.setRented(test);
        System.out.println(test);
        garage.switchStatusList(test);
        garage.listRentedCars();
        garage.listAvailableCars();


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
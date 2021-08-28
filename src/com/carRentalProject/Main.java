package com.carRentalProject;

import java.math.BigDecimal;

/* TO TRY LIST!!!
* ---ASK----> YOU HERE TO BOOK, RETURN A CAR OR GIVE US A CAR TO RENT?----COULD CREATE CLASSES FOR EACH OPTION (IT WOULD IMPLEMENT THE CLASSES AND METHODS WE ALREADY CREATED)
* IF BOOK: COULD CREATE A CUSTOMER CLASS TO KEEP A LIST OF ALL COSTUMERS WHO RENTED A CAR! (BUSAYO'S IDEA), WHEN A CAR IS BOOKED, WILL BE MOVE TO RENTED LIST. SHOW THE LIST OF RENTABLE CARS!
* IF RETURN: REMOVE COSTUMER FROM LIST AND MOVE THE RENTED CAR TO AVAILABLE LIST (AFTER CHANGING RENTED STATUS TO AVAILABLE)
* IF GIVE US A CAR: ADD THE CAR TO AVAILABLE CARS TO RENT
* */





public class Main {
    public static void main(String[] args) {
        Car test= new Car(1, "Toyota", "001A");
        Car test2= new Car(2, "Ford", "002B");
        Car test3= new Car(3, "Ferrari", "003C");
        Car test4= new Car(4, "Fiat", "004D");
        Car test5= new Car(5, "Lamborghini", "005E");

        CarRentalDB garage = new CarRentalDB();
        garage.addCar(test,4.5);
        garage.addCar(test2,5.5);
        garage.addCar(test3,6.5);
        garage.addCar(test4,7.5);
        garage.addCar(test5,8.5);

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
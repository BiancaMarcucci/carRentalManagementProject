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


        CarsManagement garage = new CarsManagement();
        Customers customer = new Customers(garage);
        //adding some cars to available list, will change it to an actual dataBase when time permits
        Car car1=new Car(1,"aaaaa","aaaaa",11d);
        Car car2=new Car(2,"bbbbb","bbbbb",22d);
        Car car3=new Car(3,"ccccc","ccccc",33d);
        Car car4=new Car(4,"ddddd","ddddd",44d);
        Car car5=new Car(5,"eeeee","eeeee",55d);
        Car car6=new Car(6,"fffff","fffff",66d);
        Car car7=new Car(7,"ggggg","ggggg",77d);
        garage.getAvailableCars().add(car1);
        garage.getAvailableCars().add(car2);
        garage.getAvailableCars().add(car3);
        garage.getAvailableCars().add(car4);
        garage.getAvailableCars().add(car5);
        garage.getAvailableCars().add(car6);
        garage.getAvailableCars().add(car7);



        // STARTING MENU
        AccessMenu startMenu=new AccessMenu();
        startMenu.Menu(garage,customer);
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
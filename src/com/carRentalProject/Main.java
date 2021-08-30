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
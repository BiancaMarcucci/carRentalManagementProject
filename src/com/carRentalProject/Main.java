package com.carRentalProject;

import java.io.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public class Main {
    public static void main(String[] args) {

        CarsManagement garage = new CarsManagement();
        Customers customers = new Customers(garage);

        // Get available cars from file

        ArrayList<Car> availableCarList = new ArrayList<>();

        try {
            FileInputStream fis = new FileInputStream("availableCarList.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            availableCarList = (ArrayList<Car>) ois.readObject();
            garage.setAvailableCars(availableCarList);
            ois.close();
        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }

        // Get rented cars from file

        ArrayList<Car> rentedCarList = new ArrayList<>();

        try {
            FileInputStream fis = new FileInputStream("rentedCarList.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            rentedCarList = (ArrayList<Car>) ois.readObject();
            garage.setRentedCars(rentedCarList);
            ois.close();
        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }

        AccessMenu startMenu = new AccessMenu();
        startMenu.Menu(garage, customers);

        // Write available cars to file

        try {
            FileOutputStream fos = new FileOutputStream("availableCarList.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(garage.getAvailableCars());
            oos.flush();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Write rented cars to file

        try {
            FileOutputStream fos = new FileOutputStream("rentedCarList.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(garage.getRentedCars());
            oos.flush();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
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
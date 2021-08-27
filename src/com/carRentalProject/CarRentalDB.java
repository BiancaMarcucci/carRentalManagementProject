/*
 - You should have one property that can store a list of cars with corresponding details
- Create a public method for adding a car to the list
- Create a public method for deleting a car from the list if car exists
- think about other methods that your application needs
*/

package com.carRentalProject;

import java.math.BigDecimal;
import java.util.ArrayList;

public class CarRentalDB {
    private ArrayList<Car> availableCars;
    private ArrayList<Car> rentedCars;

    public CarRentalDB() { //Our data base!
        this.availableCars = new ArrayList<>() ;
        this.rentedCars= new ArrayList<>();
    }
////////////////////////////////BEHAVIOURS//////////////////////////////////////////////////////
    // a method to add a car into the list of available cars.
    public ArrayList<Car> addCar(Car car, Double price){
        car.setPrice(price);
        this.availableCars.add(car);
        System.out.println("Car n. "+car.getId()+" was ADDED to rentable cars! It can be rented for £"+car.getPrice()+" per hours.");
        return this.availableCars;
    }
// a method to remove a car given the id
    public ArrayList<Car> removeCar(Integer idCar){
        for (Car car: this.availableCars){
            if(car.getId().equals(idCar)){
                this.availableCars.remove(car);
            System.out.println("Car n. "+car.getId()+" was REMOVED to rentable cars!");
            }else{
           System.out.println("The car wanted is not available to rent!");
            }
        }
        return this.availableCars;
    }
// a method to print available cars:
    public void listAvailableCars(){
        System.out.println("These are the available cars: \n"+this.availableCars);
    }
    // a method to print available cars:
    public void listRentedCars(){
        System.out.println("These are the rented cars: \n"+this.rentedCars);
    }
    // a method to change the property of a car to RENTED
    public void setRented(Car car){
    car.setCarStatus(RentedStatus.RENTED);
    }
    // a method to change the property of a car to AVAILABLE
    public void setAvailable(Car car){
        car.setCarStatus(RentedStatus.AVAILABLE);
    }
    // a method to move cars with different status in different ArrayLists
    public void switchStatusList (Car car){
        if (car.getCarStatus().equals(RentedStatus.RENTED)){
            this.rentedCars.add(car);
            this.availableCars.remove(car);
        }else{
            this.availableCars.add(car);
            this.rentedCars.remove(car);
        }
    }

/////// ADD MORE STUFF IF TIME






    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public ArrayList<Car> getAvailableCars() {
        return availableCars;
    }

    public void setAvailableCars(ArrayList<Car> availableCars) {
        this.availableCars = availableCars;
    }

    @Override
    public String toString() {
        return "CarRentalDB{" +
                "availableCars=" + availableCars +
                '}';
    }
}

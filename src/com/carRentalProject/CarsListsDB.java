/*
 - You should have one property that can store a list of cars with corresponding details
- Create a public method for adding a car to the list
- Create a public method for deleting a car from the list if car exists
- think about other methods that your application needs
*/

package com.carRentalProject;

import java.util.ArrayList;

public class CarsListsDB {
    private ArrayList<Car> availableCars;
    private ArrayList<Car> rentedCars;

    public CarsListsDB() { //Our LISTS:
        this.availableCars = new ArrayList<>() ;
        this.rentedCars= new ArrayList<>();
    }
////////////////////////////////BEHAVIOURS//////////////////////////////////////////////////////
//////////////////// ADD COMPLETELY NEW CAR TO DATABASE OR REMOVE A CAR COMPLETELY/////////////////////////////////////
    // a method to add a car into the list of AVAILABLE cars.
    public ArrayList<Car> addCarToAvailable(Car availableCar, Double price){
        availableCar.setPrice(price);
        this.availableCars.add(availableCar);
        System.out.println("Car n. "+availableCar.getId()+" was ADDED to rentable cars! It can be rented for £"+availableCar.getPrice()+" per hour.");
        return this.availableCars;
    }
// a method to remove a car given the id from AVAILABLE list
    public ArrayList<Car> removeCarFromAvailable(Integer idCar) {
        for (Car car : this.availableCars) {
            if (car.getId().equals(idCar)) {
                this.availableCars.remove(car);
                System.out.println("Car n. " + car.getId() + " was REMOVED to rentable cars!");
            } else {
                System.out.println("The car wanted is not available to rent!");
            }
        }
        return this.availableCars;
    }
///////////////// METHODS TO MOVE CARS (RENTED OR AVAILABLE ) BETWEEN LISTS OF RENTED OR AVAILABLE CARS///////////////////
    ///// a method to add a car to the list of RENTED cars

////////////////// methods to move cars with different status in different ArrayLists ///////////////////////////////////
    // a method to change the property of a car to RENTED and move it car to the rentedlist
    public void setRented(Car car){
        car.setCarStatus(RentedStatus.RENTED);
        this.switchStatusList(car);
    }
    // a method to change the property of a car to AVAILABLE and move it car to the available list
    public void setAvailable(Car car){
        car.setCarStatus(RentedStatus.AVAILABLE);
        this.switchStatusList(car);
    }
    // method to switch lists, used in SetRented and SetAvailable
    public void switchStatusList (Car car){
        if (car.getCarStatus().equals(RentedStatus.RENTED)){
            this.rentedCars.add(car);
            this.availableCars.remove(car);
        }else if(car.getCarStatus().equals(RentedStatus.AVAILABLE)){
            this.availableCars.add(car);
            this.rentedCars.remove(car);
        }
    }
////////////////////////////////// TO PRINT LISTS OF AVAILABLE OR RENTED CARS //////////////////////////////////////////
    // a method to print available cars:
    public void listAvailableCars(){
        System.out.println("These are the available cars: \n"+this.availableCars);
    }

    // a method to print rented cars:
    public void listRentedCars(){
        System.out.println("These are the rented cars: \n"+this.rentedCars);
    }


    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public ArrayList<Car> getAvailableCars() {
        return availableCars;
    }

    public void setAvailableCars(ArrayList<Car> availableCars) {
        this.availableCars = availableCars;
    }

    public ArrayList<Car> getRentedCars() {
        return rentedCars;
    }

    public void setRentedCars(ArrayList<Car> rentedCars) {
        this.rentedCars = rentedCars;
    }

    @Override
    public String toString() {
        return "CarsListsDB{" +
                "availableCars=" + availableCars +
                ", rentedCars=" + rentedCars +
                '}';
    }
}

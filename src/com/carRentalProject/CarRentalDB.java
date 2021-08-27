/*
 - You should have one property that can store a list of cars with corresponding details
- Create a public method for adding a car to the list
- Create a public method for deleting a car from the list if car exists
- think about other methods that your application needs
*/

package com.carRentalProject;

import java.util.ArrayList;

public class CarRentalDB {
    private ArrayList<Car> availableCars;

    public CarRentalDB(ArrayList<Car> availableCars) {
        this.availableCars = availableCars;
    }
////////////////////////////////BEHAVIOURS//////////////////////////////////////////////////////
    // a method to add a car into the list of available cars.
    public ArrayList<Car> addCar(Car car){
        this.availableCars.add(car);
        System.out.println("Car n. "+car.getId()+" was ADDED to rentable cars!");
        return this.availableCars;
    }

    public ArrayList<Car> removeCar(Integer idCar){

        for (Car car: this.availableCars){
            if(car.getId()==idCar){
                this.availableCars.remove(car);
            System.out.println("Car n. "+car.getId()+" was REMOVED to rentable cars!");
            }else{
           System.out.println("The car wanted is not available to rent!");
            }
        }
        return this.availableCars;
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

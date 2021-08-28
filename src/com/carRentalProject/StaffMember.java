package com.carRentalProject;

import java.util.ArrayList;

public class StaffMember {







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
}

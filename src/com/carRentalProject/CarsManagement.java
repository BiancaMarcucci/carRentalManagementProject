/*
 - You should have one property that can store a list of cars with corresponding details
- Create a public method for adding a car to the list
- Create a public method for deleting a car from the list if car exists
- think about other methods that your application needs
*/

package com.carRentalProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CarsManagement {
    private ArrayList<Car> availableCars;
    private ArrayList<Car> rentedCars;

    public CarsManagement() { //Our LISTS:
        this.availableCars = new ArrayList<>() ;
        this.rentedCars= new ArrayList<>();
    }
////////////////////////////////BEHAVIOURS//////////////////////////////////////////////////////
//////////////////// ADD COMPLETELY NEW CAR TO DATABASE OR REMOVE A CAR COMPLETELY/////////////////////////////////////
    // a method to add a car into the list of AVAILABLE cars. Ask user to give details of car they want to add.
    public void addNewCarToAvailable(){

        // creating new car, ask user to give details.
        System.out.println("GIVE CAR'S DETAILS");
        Car newCar = new Car();
        Scanner scanner = new Scanner(System.in);

        // get make
        System.out.println("Enter Car Make: ");
        String carMake = scanner.nextLine();
        newCar.setMake(carMake);

        //get reg number, do not have the time, but would be cool to make a regex for this....
        System.out.println("Enter Registration Number: ");
        String carReg = scanner.nextLine();
        newCar.setRegNum(carReg);

        //get price and add to available cars
        System.out.println("Enter daily rental price (per hour): ");
        double carPrice = scanner.nextDouble();
        newCar.setPrice(carPrice);

        //get id
        System.out.println("Enter unique id: ");
        int carID = scanner.nextInt();
        newCar.setId(carID);


        this.availableCars.add(newCar);
        System.out.println("you successfully added the "+newCar.getMake()+", with the assigned ID: "+newCar.getId()+", for the price of £"+newCar.getPrice()+" per hour");


    }
// a method to remove a car given the id from AVAILABLE list

    public void removeCarFromAvailable() {
        Boolean stillSearching= true;
        while(stillSearching) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Give the ID of the car you want to remove from the system: ");
            Integer idCar = scanner.nextInt();
            List<Car> holdingCarToRemove = this.getAvailableCars().stream().filter(avCar -> avCar.getId().equals(idCar)).collect(Collectors.toList());
            if (!holdingCarToRemove.isEmpty()) {
                System.out.println("You successfully REMOVED our " + holdingCarToRemove.get(0).getMake() + "!");
                this.availableCars.remove(holdingCarToRemove.get(0));
                stillSearching=false;
            } else {
                System.out.println("Could not find the car you want to remove, please give the right Identification code?");
            }
        }
    }
///////////////// METHODS TO MOVE CARS (RENTED OR AVAILABLE ) BETWEEN LISTS OF RENTED OR AVAILABLE CARS///////////////////
    ///// a method to add a car to the list of RENTED cars

////////////////// methods to move cars with different status in different ArrayLists ///////////////////////////////////
    // a method to change the property of a car to RENTED and move it car to the rentedlist
    public void setRented(Car car,Person customerRenting){
        car.setCarStatus(RentedStatus.RENTED);
        car.setFirstNameClient(customerRenting.getFirstName());
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

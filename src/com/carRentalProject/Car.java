package com.carRentalProject;

import java.math.BigDecimal;

public class Car {
    private Integer id;
    private String make;
    private String regNum;///// CAN REMOVE TO BE HONEST
    private Double price;
    private RentedStatus carStatus;
    private String firstNameClient; /// this is to save client details to know who rented a specific car. need time to implement it, do only if time
    private String lastNameClient;
    private Integer idClient;


    public Car() {
        this.id = id;
        this.make = make;
        this.regNum = regNum;
        this.price = 0.0;
        this.carStatus = RentedStatus.AVAILABLE;
        this.firstNameClient = "N/A";
        this.lastNameClient = "N/A";
        this.idClient = 0;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getRegNum() {
        return regNum;
    }

    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public RentedStatus getCarStatus() {
        return carStatus;
    }

    public void setCarStatus(RentedStatus carStatus) {
        this.carStatus = carStatus;
    }

    public String getFirstNameClient() {
        return firstNameClient;
    }

    public void setFirstNameClient(String firstNameClient) {
        this.firstNameClient = firstNameClient;
    }

    public String getLastNameClient(String lastName) {
        return lastNameClient;
    }

    public void setLastNameClient(String lastNameClient) {
        this.lastNameClient = lastNameClient;
    }

    public Integer getIdClient() {
        return idClient;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", regNum='" + regNum + '\'' +
                ", price=" + price +
                ", carStatus=" + carStatus +
                ", Rented by: "+
                " firstNameClient='" + firstNameClient + '\'' +
                ", lastNameClient='" + lastNameClient + '\'' +
                ", idClient=" + idClient +
                '}';
    }
}




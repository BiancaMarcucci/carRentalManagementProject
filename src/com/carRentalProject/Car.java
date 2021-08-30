package com.carRentalProject;

import java.math.BigDecimal;

public class Car {
    private Integer id;
    private String make;
    private String regNum;///// CAN REMOVE TO BE HONEST
    private Double price;
    private RentedStatus carStatus;

    public Car() {
        this.id = id;
        this.make = make;
        this.regNum = regNum;
        this.price = 0.0;
        this.carStatus = RentedStatus.AVAILABLE;
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

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", regNum='" + regNum + '\'' +
                ", price=" + price +
                ", carStatus=" + carStatus +
                '}';
    }
}


package com.carRentalProject;

import java.math.BigDecimal;

public class Car {
    private Integer id;
    private String make;
    private String regNum;
    private BigDecimal price; /////ADD ONLY IF TIME AND WILL
    private RentedStatus carStatus;

    public Car(Integer id, String make, String regNum, BigDecimal price, RentedStatus carStatus) {
        this.id = id;
        this.make = make;
        this.regNum = regNum;
        this.price = price;
        this.carStatus = carStatus;
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
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


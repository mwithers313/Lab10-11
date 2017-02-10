package com.company;


public class UsedCar extends Car {

    private String make = ""; //these are instance variables
    private String model = "";
    private int year = 0;
    private double price = 0.0;
    private String condition = "";
    private double miles = 0.0;


    public UsedCar(String make, String model, int year, double price, String condition, double miles) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.condition = condition;
        this.miles = miles;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public double getMiles() {
        return miles;
    }

    public void setMiles(double miles) {
        this.miles = miles;
    }

    @Override
    public String toString() {

        return make + "\t" + model + "\t" + year + "\t" + price + "(" + condition + ")" + miles;

    }
}


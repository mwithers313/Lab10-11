package com.company;


public class Car {


    // we declared these private and the Main cant see them.
    private String make = ""; //these are instance variables
    private String model = "";
    private int year = 0;
    private double price = 0.0;

    private String condition = "";

    //create instance variables the right click and generate Constructor and then generate getters and setters

    public Car() { // this is used as a default.....need better explanation.
    }


    public Car(String make, String model, int year, double price, String condition) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;

        this.condition = condition;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
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

    @Override //allows us change the way our object is printed out. In this case we are overriding the toString();
    public String toString() {

        return make + "\t" + model + "\t" + year + "\t" + price; // "\t" generates a tab space in between what we are printing
    }
}



package com.bl.encapsulation.ridehailingapplication;

public class Car extends Vehicle implements GPS  {

    private String location;

    public Car(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    public double calculateFare(double distance) {
        return (getRatePerKm() * distance) + 50; // base charge
    }

    public String getCurrentLocation() {
        return location;
    }

    public void updateLocation(String newLocation) {
        location = newLocation;
    }

}

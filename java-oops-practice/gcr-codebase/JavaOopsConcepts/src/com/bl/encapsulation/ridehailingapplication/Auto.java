package com.bl.encapsulation.ridehailingapplication;

public class Auto extends Vehicle implements GPS {

	private String location;

    public Auto(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    public double calculateFare(double distance) {
        return (getRatePerKm() * distance) + 20; // service charge
    }

    public String getCurrentLocation() {
        return location;
    }

    public void updateLocation(String newLocation) {
        location = newLocation;
    }
}

package com.bl.encapsulation.ridehailingapplication;

public class Bike extends Vehicle implements GPS  {
	private String location;

    public Bike(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    public double calculateFare(double distance) {
        return getRatePerKm() * distance; // cheapest ride
    }

    public String getCurrentLocation() {
        return location;
    }

    public void updateLocation(String newLocation) {
        location = newLocation;
    }
}

package com.bl.day3.cabbyGo;

public abstract class Vehicle {
	private String vehicleNumber;
    private int capacity;
    private String type;
    protected double ratePerKm;   // used by child classes

    public Vehicle(String vehicleNumber, int capacity, String type, double ratePerKm) {
        this.vehicleNumber = vehicleNumber;
        this.capacity = capacity;
        this.type = type;
        this.ratePerKm = ratePerKm;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public String getType() {
        return type;
    }

}

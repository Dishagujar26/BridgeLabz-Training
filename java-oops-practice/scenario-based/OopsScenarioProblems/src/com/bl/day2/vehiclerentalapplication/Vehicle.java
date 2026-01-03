package com.bl.day2.vehiclerentalapplication;

public abstract class Vehicle implements Rentable{
	 protected int vehicleId;
	    protected String brand;
	    protected double baseRate;

	    Vehicle(int vehicleId, String brand, double baseRate) {
	        this.vehicleId = vehicleId;
	        this.brand = brand;
	        this.baseRate = baseRate;
	    }

	    public int getVehicleId() {
	        return vehicleId;
	    }

	    public String getBrand() {
	        return brand;
	    }
	    
}

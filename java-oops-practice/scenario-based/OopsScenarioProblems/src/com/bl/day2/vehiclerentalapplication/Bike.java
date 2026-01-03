package com.bl.day2.vehiclerentalapplication;

public class Bike extends Vehicle{
	 Bike(int id, String brand) {
	        super(id, brand, 300);
	    }

	    @Override
	    public double calculateRent(int days) {
	        return baseRate * days;
	    }
}

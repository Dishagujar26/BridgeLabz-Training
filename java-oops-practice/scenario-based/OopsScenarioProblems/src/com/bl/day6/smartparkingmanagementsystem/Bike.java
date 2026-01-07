package com.bl.day6.smartparkingmanagementsystem;

public class Bike extends Vehicle {
	public Bike(String vehicleNumber) {
		super(vehicleNumber, 30);
	}

	public double calculateCharges(int hours) {
		return baseRate * hours;
	}
}

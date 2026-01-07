package com.bl.day6.smartparkingmanagementsystem;

public class Truck extends Vehicle {
	public Truck(String vehicleNumber) {
		super(vehicleNumber, 80);
	}

	public double calculateCharges(int hours) {
		double penalty = (hours > 5) ? 200 : 0;
		return (baseRate * hours) + penalty;
	}
}

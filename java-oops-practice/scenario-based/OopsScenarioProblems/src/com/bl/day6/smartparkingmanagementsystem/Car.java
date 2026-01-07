package com.bl.day6.smartparkingmanagementsystem;

public class Car extends Vehicle {
	public Car(String vehicleNumber) {
		super(vehicleNumber, 50);
	}

	public double calculateCharges(int hours) {
		return baseRate * hours;
	}
}

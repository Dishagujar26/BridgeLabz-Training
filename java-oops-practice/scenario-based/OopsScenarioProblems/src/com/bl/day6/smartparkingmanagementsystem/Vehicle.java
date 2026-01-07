package com.bl.day6.smartparkingmanagementsystem;

public abstract class Vehicle implements IPayable {
	protected String vehicleNumber;
	protected double baseRate;

	public Vehicle(String vehicleNumber, double baseRate) {
		this.vehicleNumber = vehicleNumber;
		this.baseRate = baseRate;
	}
}

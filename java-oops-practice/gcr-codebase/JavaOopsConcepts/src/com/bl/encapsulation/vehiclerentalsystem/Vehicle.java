package com.bl.encapsulation.vehiclerentalsystem;

public abstract class Vehicle {
	private String vehicleNumber;
	private String type;
	private double rentalRate; // per day

	public Vehicle(String vehicleNumber, String type, double rentalRate) {
		this.vehicleNumber = vehicleNumber;
		this.type = type;
		this.rentalRate = rentalRate;
	}

	// Encapsulation
	public double getRentalRate() {
		return rentalRate;
	}

	protected String getVehicleNumber() {
		return vehicleNumber;
	}

	public abstract double calculateRentalCost(int days);

}

package com.bl.encapsulation.vehiclerentalsystem;

public class Truck extends Vehicle implements Insurable {
	public Truck(String number, double rate) {
		super(number, "Truck", rate);
	}

	public double calculateRentalCost(int days) {
		return (getRentalRate() * days) + 1000; // extra load charge
	}

	public double calculateInsurance() {
		return 1000;
	}

	public String getInsuranceDetails() {
		return "Truck Insurance";
	}

}

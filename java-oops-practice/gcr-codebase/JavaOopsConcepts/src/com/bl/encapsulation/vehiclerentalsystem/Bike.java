package com.bl.encapsulation.vehiclerentalsystem;

public class Bike extends Vehicle implements Insurable {
	public Bike(String number, double rate) {
		super(number, "Bike", rate);
	}

	public double calculateRentalCost(int days) {
		return getRentalRate() * days;
	}

	public double calculateInsurance() {
		return 200;
	}

	public String getInsuranceDetails() {
		return "Bike Insurance";
	}

}

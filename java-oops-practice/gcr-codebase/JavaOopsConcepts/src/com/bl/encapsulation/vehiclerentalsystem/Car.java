package com.bl.encapsulation.vehiclerentalsystem;

public class Car extends Vehicle implements Insurable{
	private String insurancePolicyNumber; // sensitive

	public Car(String number, double rate, String policyNo) {
		super(number, "Car", rate);
		this.insurancePolicyNumber = policyNo;
	}

	public double calculateRentalCost(int days) {
		return getRentalRate() * days;
	}

	public double calculateInsurance() {
		return 500; // flat insurance
	}

	public String getInsuranceDetails() {
		return "Car Insurance (Policy Hidden)";
	}

}

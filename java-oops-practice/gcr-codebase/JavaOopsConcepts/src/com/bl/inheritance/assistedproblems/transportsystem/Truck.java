package com.bl.inheritance.assistedproblems.transportsystem;

public class Truck extends Vehicle{
	String truckModel;
	String color;
	
	public Truck(int maxSpeed, String fuelType, String truckModel, String color) {
		super(maxSpeed, fuelType);
		this.truckModel = truckModel;
		this.color = color;
	}
	
	@Override
	void displayInfo() {
		super.displayInfo();
		System.out.println("Car Model: "+ truckModel);
		System.out.println("Color: "+ color);

	}
	

}

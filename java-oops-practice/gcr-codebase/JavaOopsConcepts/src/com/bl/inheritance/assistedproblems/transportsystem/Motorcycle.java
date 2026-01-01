package com.bl.inheritance.assistedproblems.transportsystem;

public class Motorcycle extends Vehicle{
	String  motorModel;
	String color;
	
	public Motorcycle(int maxSpeed, String fuelType, String motorModel, String color) {
		super(maxSpeed, fuelType);
		this.motorModel = motorModel;
		this.color = color;
	}
	
	@Override
	void displayInfo() {
		super.displayInfo();
		System.out.println("Car Model: "+ motorModel);
		System.out.println("Color: "+ color);

	}

}

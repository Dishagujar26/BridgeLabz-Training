package com.bl.inheritance.assistedproblems.transportsystem;

public class Car extends Vehicle {
	String carModel;
	String color;
	int seatCapacity;

	public Car(int maxSpeed, String fuelType, String carModel, String color, int seatCapacity) {
		super(maxSpeed, fuelType);
		this.carModel = carModel;
		this.color = color;
		this.seatCapacity = seatCapacity;
	}
    
	@Override
	void displayInfo() {
		super.displayInfo();
		System.out.println("Car Model: "+ carModel);
		System.out.println("Color: "+ color);
		System.out.println("Car Seat Capacity:  "+ seatCapacity);

	}
}

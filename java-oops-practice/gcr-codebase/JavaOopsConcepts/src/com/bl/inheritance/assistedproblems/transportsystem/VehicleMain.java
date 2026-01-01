package com.bl.inheritance.assistedproblems.transportsystem;

public class VehicleMain {

	public static void main(String[] args) {
		Vehicle vehicle = new Car(82, "diesel", "Mahindra XUV", "Black", 5);
		vehicle.displayInfo();

		vehicle = new Truck(95, "petrol", "TATA Ace", "Orange");
		vehicle.displayInfo();

		vehicle = new Motorcycle(100, "petrol", "TVS Jupitar", "Grey");
		vehicle.displayInfo();
	}

}

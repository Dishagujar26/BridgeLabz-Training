package com.bl.inheritance.hybridinheritance.vehiclemanagementsystem;

public class VehicleMain {

	public static void main(String[] args) {

		ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 200);
		PetrolVehicle pv = new PetrolVehicle("Honda City", 180);

		ev.charge();
		pv.refuel();
	}

}

package com.bl.constructor;

public class VehicleMain {
	
	public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Amit", "Car");
        Vehicle v2 = new Vehicle("Riya", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        // Update registration fee for all vehicles
        Vehicle.updateRegistrationFee(2500);

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}

package com.bl.constructor;

public class Vehicle {
	
    String ownerName;
    String vehicleType;
    static double registrationFee = 2000;

    // constructor
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // instance method
    void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
        System.out.println();
    }

    // class method
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

}

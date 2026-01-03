package com.bl.day2.vehiclerentalapplication;

public class Truck extends Vehicle{
	Truck(int id, String brand) {
        super(id, brand, 2000);
    }

    @Override
    public double calculateRent(int days) {
        return (baseRate * days) + (days * 300); // heavy load charge
    }
}

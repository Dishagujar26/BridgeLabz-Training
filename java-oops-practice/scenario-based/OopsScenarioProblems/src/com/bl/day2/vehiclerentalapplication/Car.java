package com.bl.day2.vehiclerentalapplication;

public class Car extends Vehicle{
	Car(int id, String brand) {
        super(id, brand, 1000);
    }

    @Override
    public double calculateRent(int days) {
        return (baseRate * days) + 500; 
    }
}

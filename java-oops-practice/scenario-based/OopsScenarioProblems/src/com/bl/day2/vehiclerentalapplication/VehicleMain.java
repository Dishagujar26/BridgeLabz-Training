package com.bl.day2.vehiclerentalapplication;

public class VehicleMain {

	public static void main(String[] args) {

        Customer c1 = new Customer(1, "Amit");

        Vehicle bike = new Bike(101, "Honda");
        Vehicle car = new Car(102, "Hyundai");
        Vehicle truck = new Truck(103, "Tata");

        System.out.println("Bike Rent: " + bike.calculateRent(3));
        System.out.println("Car Rent: " + car.calculateRent(3));
        System.out.println("Truck Rent: " + truck.calculateRent(3));
    }
}

package com.bl.encapsulation.ridehailingapplication;

public class RideService {

	public static void calculateRideFare(Vehicle vehicle, double distance) {
        System.out.println(vehicle.getVehicleDetails());
        System.out.println("Fare: ₹" + vehicle.calculateFare(distance));
        System.out.println("------------------------");
    }

    public static void main(String[] args) {

        Vehicle v1 = new Car("CAR101", "Rahul", 15);
        Vehicle v2 = new Bike("BIKE202", "Amit", 8);
        Vehicle v3 = new Auto("AUTO303", "Suresh", 10);

        calculateRideFare(v1, 10);
        calculateRideFare(v2, 10);
        calculateRideFare(v3, 10);
    }
}

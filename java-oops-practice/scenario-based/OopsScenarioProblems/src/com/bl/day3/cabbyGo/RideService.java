package com.bl.day3.cabbyGo;

public class RideService implements IRideService {
	private String name;
	private String location;
	private double fare;
	private static final double BASE_FARE = 50;

	@Override
	public void bookRide(Vehicle v, Driver d, double distance) {
		fare = BASE_FARE + distance * v.getRatePerKm();
		location = "Ride Started";

		System.out.println("Ride booked with " + v.getType());
		System.out.println("Driver: " + d.getName());
		System.out.println("Fare:" + fare);

	}

	@Override
	public void endRide() {
		// TODO Auto-generated method stub

	}

}

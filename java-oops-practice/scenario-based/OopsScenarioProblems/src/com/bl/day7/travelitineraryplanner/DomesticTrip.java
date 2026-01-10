package com.bl.day7.travelitineraryplanner;

public class DomesticTrip extends Trip {
	public DomesticTrip(String destination, double budget, int duration, Transport transport, Hotel hotel,
			Activity activity) {
		super(destination, budget, duration, transport, hotel, activity);
	}

	@Override
	public void book() {
		System.out.println("Domestic trip booked with passport & visa verification");
		tripDetails();
	}

	@Override
	public void cancel() {
		System.out.println("Domestic trip cancelled with refund policy");
	}
}

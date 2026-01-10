package com.bl.day7.travelitineraryplanner;

public class InternationalTrip extends Trip {

	public InternationalTrip(String destination, double budget, int duration, Transport transport, Hotel hotel,
			Activity activity) {
		super(destination, budget, duration, transport, hotel, activity);
	}

	@Override
    public void book() {
        System.out.println("International trip booked with passport & visa verification");
		tripDetails();

    }

    @Override
    public void cancel() {
        System.out.println("International trip cancelled with refund policy");
    }
	
}

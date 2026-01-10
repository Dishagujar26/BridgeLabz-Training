package com.bl.day7.travelitineraryplanner;

public abstract class Trip {
	protected String destination;
	protected double budget;
	protected int duration;

	private Transport transport;
	private Hotel hotel;
	private Activity activity;
	
	private double tripCost;
	
	public Trip(String destination, double budget, int duration, Transport transport, Hotel hotel, Activity activity) {
		super();
		this.destination = destination;
		this.budget = budget;
		this.duration = duration;
		this.transport = transport;
		this.hotel = hotel;
		this.activity = activity;
	}
    
	public abstract void book();
	public abstract void cancel();
	 
	public void tripDetails() {
		System.out.println("Destination: "+ destination);
		System.out.println("Duration: "+ duration);
		System.out.println("Transport: "+ transport.getName());
		System.out.println("Hotel: "+ hotel.getName());
		System.out.println("Activity: "+ activity.getName());

        tripCost = transport.getCost() + hotel.getCost() + activity.getCost();
	}
}

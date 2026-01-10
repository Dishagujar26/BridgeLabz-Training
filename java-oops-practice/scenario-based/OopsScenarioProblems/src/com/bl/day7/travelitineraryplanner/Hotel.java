package com.bl.day7.travelitineraryplanner;

public class Hotel {
	private double cost;
	private String name;

	public Hotel(String name,double cost) {
		this.cost = cost;
		this.name=  name;
	}
	
	public double getCost() {
		return cost;
	}
	
	public String getName() {
		return name;
	}
}

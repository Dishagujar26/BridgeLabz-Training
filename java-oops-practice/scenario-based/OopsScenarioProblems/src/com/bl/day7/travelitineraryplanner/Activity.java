package com.bl.day7.travelitineraryplanner;

public class Activity {
	private double cost;
	private String name;

	public Activity(String name,double cost) {
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

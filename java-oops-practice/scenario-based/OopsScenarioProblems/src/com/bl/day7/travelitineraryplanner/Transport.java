package com.bl.day7.travelitineraryplanner;

public class Transport {
	private String name;
	private double cost;

	public Transport(String name,double cost) {
		this.cost = cost;
		this.name=name;
	}
	
	public double getCost() {
		return cost;
	}
	public String getName() {
		return name;
	}
}

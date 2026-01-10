package com.bl.day8.restaurantorderingsystem;

public class FoodItem{
	protected String name;
	protected String category;
	private double price;
	protected boolean availability = true;
	private int stock = 10;

	public FoodItem(String name, String category, double price) {
		super();
		this.name = name;
		this.category = category;
		this.price = price;
	}
	
	public boolean isAvailable() {
		return stock > 0;
	}
	public void reduceStock() {
		if(stock > 0) {
			stock--;
		}
		availability = stock > 0;
	}
	public double getPrice() {
		return price;
	}
	
}

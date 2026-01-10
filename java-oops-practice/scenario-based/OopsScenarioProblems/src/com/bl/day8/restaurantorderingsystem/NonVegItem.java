package com.bl.day8.restaurantorderingsystem;

public class NonVegItem extends FoodItem{

	public NonVegItem(String name, String category, double price) {
		super(name, category, price);
		
	}

	public void listOfNonVegItems() {
		System.out.println("1. Chicken Biryani (serves 1)	₹180 - ₹400"
				+ "\n2. Mutton Biryani (serves 1)	₹350 - ₹500"
				+ "\n3. Butter Chicken	₹250 - ₹450"
				+ "\n4. Mutton Rogan Josh	₹300 - ₹550"
				+ "\n5. Prawns Curry  ₹250 - ₹450");
	}

}

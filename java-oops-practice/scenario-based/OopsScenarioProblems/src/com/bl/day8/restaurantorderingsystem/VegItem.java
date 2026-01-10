package com.bl.day8.restaurantorderingsystem;

public class VegItem extends FoodItem{

	public VegItem(String name, String category, double price) {
		super(name, category, price);
	}

	public void listOfVegItems() {
		System.out.println("1. Paneer Butter Masala/Shahi Paneer: ₹180 - ₹400"
				+ "\n2. Dal Makhani/Dal Tadka: ₹150 - ₹300"
				+ "\n3. Aloo Gobi/Mix Veg Curry: ₹120 - ₹250"
				+ "\n4. Palak Paneer: ₹160 - ₹350"
				+ "\n5. Chole Bhature/Chana Masala: ₹100 - ₹220");
	}
}

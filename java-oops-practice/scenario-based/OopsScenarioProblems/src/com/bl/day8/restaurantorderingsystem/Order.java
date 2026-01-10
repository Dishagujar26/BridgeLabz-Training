package com.bl.day8.restaurantorderingsystem;

import java.util.ArrayList;
import java.util.List;

public class Order implements IOrderable {
	List<FoodItem> items = new ArrayList<>();
	double originaTotalPrice = 0.0;

	public void addItem(FoodItem i) {
		if (i.isAvailable()) {		
			items.add(i);
			originaTotalPrice += i.getPrice();
			i.reduceStock();
		}
		else {
			System.out.println( i.name+" is out of stock!!");
		}
	}

	public double applyDiscount() {
		if (originaTotalPrice > 500.0) {
			double discountedTotalPrice = originaTotalPrice * 0.9;
			return discountedTotalPrice;
		}
		return originaTotalPrice;
	}

	public void placeOrder() {
		System.out.println("Order Placed Successfully!!");
		for (int i = 0; i < items.size(); i++) {
			System.out.println("Item No. "+ (i+1) + " "+ items.get(i).name + " Category: "+ items.get(i).category);
		}
		if(originaTotalPrice == applyDiscount()) {
			System.out.println("Sorry, no discount applied!!");
			System.out.println("Total Amount "+ applyDiscount());
		}
		else {
			System.out.println("Congratulations, discount applied!!");
			System.out.println("Total Amount "+ applyDiscount());
		}
		
	}

	public void cancelOrder() {
		System.out.println("Order cancled successfully!");
		items.clear(); // empty list
	}

}

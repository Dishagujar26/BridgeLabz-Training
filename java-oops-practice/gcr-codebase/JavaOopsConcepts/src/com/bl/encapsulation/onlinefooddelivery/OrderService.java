package com.bl.encapsulation.onlinefooddelivery;

public class OrderService {
	public static void processOrder(FoodItem item) {
		item.getItemDetails();
		double total = item.calculateTotalPrice();

		if (item instanceof Discountable) {
			total -= ((Discountable) item).applyDiscount();
		}

		System.out.println("Final Amount: " + total);
	}

	public static void main(String[] args) {
		FoodItem f1 = new VegItem("Paneer Roll", 120, 2);
		FoodItem f2 = new NonVegItem("Chicken Burger", 180, 1);

		processOrder(f1);
		processOrder(f2);
	}
}

package com.bl.encapsulation.ecommerceplatform;

public class ECommerceMain {
	public static void main(String[] args) {

		Product p1 = new Electronics(101, "Laptop", 60000);
		Product p2 = new Clothing(102, "Jacket", 3000);
		Product p3 = new Groceries(103, "Rice", 1000);

		PriceCalculator.printFinalPrice(p1);
		PriceCalculator.printFinalPrice(p2);
		PriceCalculator.printFinalPrice(p3);
	}

}

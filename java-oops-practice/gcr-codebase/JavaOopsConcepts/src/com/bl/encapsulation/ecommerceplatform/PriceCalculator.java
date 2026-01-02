package com.bl.encapsulation.ecommerceplatform;

public class PriceCalculator {

	public static void printFinalPrice(Product product) {
		double price = product.getPrice();
		double discount = product.calculateDiscount();
		double tax = 0;

		if (product instanceof Taxable) {
			tax = ((Taxable) product).calculateTax();
		}

		double finalPrice = price + tax - discount;
		System.out.println("Final Price: ₹" + finalPrice);
	}

}

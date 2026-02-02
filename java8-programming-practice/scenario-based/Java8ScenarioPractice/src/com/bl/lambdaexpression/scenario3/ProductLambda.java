package com.bl.lambdaexpression.scenario3;

import java.util.Arrays;
import java.util.List;

public class ProductLambda {
	public static void main(String[] args) {
		List<Product> products = Arrays.asList(new Product("Laptop", 50000), new Product("Mouse", 800),
				new Product("Keyboard", 1500));

		// 1. Apply 10% discount
		products.forEach(p -> System.out.println(p.name + " Discounted: " + (p.price * 0.9)));

		// 2. Sort by price
		products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
		System.out.println("Sorted by price: " + products);

		// 3. Free delivery if amount > 500
		products.forEach(p -> System.out.println(p.name + " Free delivery? " + (p.price > 500)));

		// 4. Final bill amount (sum of all prices)
		double total = products.stream().mapToDouble(p -> p.price).sum();
		System.out.println("Final bill: " + total);

		// 5. Print product names
		products.forEach(p -> System.out.println(p.name));
	}
}
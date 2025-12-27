package com.bl.constructor;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\nAdd New Product");

			// Clear buffer before taking String input
			System.out.print("Enter Product Name: ");
			String name = sc.nextLine();

			// Validate price
			double price;
			do {
				System.out.print("Enter Price: ");
				price = sc.nextDouble();
				sc.nextLine(); // buffer clear after nextDouble
			} while (price <= 0);

			// Create Product object
			Product p1 = new Product(name, price);

			// Display product details
			System.out.println("\nProduct Details:");
			p1.displayProductDetails();

			System.out.print("\nDo you want to add more products? (yes/no): ");
			String choice = sc.nextLine();

			if (!choice.equalsIgnoreCase("yes")) {
				break;
			}
		}

		// Display total products added
		System.out.println("\nTotal Products Added:");
		Product.displayTotalProducts();
		sc.close();
	}
}

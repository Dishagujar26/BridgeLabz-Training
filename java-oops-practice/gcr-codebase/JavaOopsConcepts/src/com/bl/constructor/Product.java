package com.bl.constructor;

public class Product {
	
	String productName;
	double price;
	static int totalProducts;
	
	public Product(String productName, double price) {
		this.productName = productName;
		this.price = price;
		totalProducts++;
	}
	
	// method to display the details of a product.
	public void displayProductDetails() {
		System.out.println("Product Name "+ productName);
		System.out.println("Price "+ price);
	}
	
	// show the total number of products created
	public static void displayTotalProducts() {
		System.out.println("Total Products  "+ totalProducts);
	}

}

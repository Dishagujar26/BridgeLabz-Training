package com.bl.objectmodeling.selfproblems.problem4;

public class Product {
    
	// product is an independent entity
	
	String name;
	double price;

	Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	void show() {
		System.out.println(name + " - ₹" + price);
	}

}

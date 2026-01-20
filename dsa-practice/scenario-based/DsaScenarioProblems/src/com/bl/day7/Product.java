package com.bl.day7;

public class Product {
	String name;
    double discount;

    Product(String name, double discount) {
        this.name = name;
        this.discount = discount;
    }

	@Override
	public String toString() {
		return "Product [name=" + name + ", discount=" + discount + "]";
	}
    
    
}


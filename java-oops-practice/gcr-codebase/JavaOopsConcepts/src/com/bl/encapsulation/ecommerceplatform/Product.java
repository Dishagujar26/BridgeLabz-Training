package com.bl.encapsulation.ecommerceplatform;

public abstract class Product {
	private int productId;
	private String name;
	protected double price;

	public Product(int productId, String name, double price) {
		super();
		this.productId = productId;
		this.name = name;
		this.price = price;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	abstract double calculateDiscount();
}

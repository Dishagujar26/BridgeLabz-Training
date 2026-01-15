package com.bl.day3.supermarketbillingqueue;

import java.util.HashMap;

public class Customer {
	private String name;
	private HashMap<String, Integer> cart;

	public Customer(String name) {
		this.name = name;
		cart = new HashMap<>();
	}

	public String getName() {
		return name;
	}

	public HashMap<String, Integer> getCart() {
		return cart;
	}

	public void addItem(String item, int qty) {
		cart.put(item, cart.getOrDefault(item, 0) + qty);
	}
}

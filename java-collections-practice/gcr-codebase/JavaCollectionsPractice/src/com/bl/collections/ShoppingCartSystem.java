package com.bl.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ShoppingCartSystem {

	HashMap<String, Double> prices = new HashMap<>();
	LinkedHashMap<String, Double> cart = new LinkedHashMap<>();

	// Add product and price
	public void addProduct(String product, double price) {
		prices.put(product, price); // store all prices
		cart.put(product, price); // maintain order in cart
	}

	// Display cart by insertion order
	public void displayCartByOrder() {
		System.out.println("Cart (order added): " + cart);
	}

	// Display cart sorted by price
	public void displayCartByPrice() {
		TreeMap<Double, List<String>> sorted = new TreeMap<>();
		for (Map.Entry<String, Double> entry : cart.entrySet()) {
			sorted.computeIfAbsent(entry.getValue(), k -> new ArrayList<>()).add(entry.getKey());
		}
		System.out.println("Cart (sorted by price): " + sorted);
	}
	
	public static void main(String[] args) {
		ShoppingCartSystem cart = new ShoppingCartSystem();
		cart.addProduct("Laptop", 1200);
		cart.addProduct("Mouse", 25);
		cart.addProduct("Keyboard", 50);

		cart.displayCartByOrder();
		cart.displayCartByPrice();

	}
}

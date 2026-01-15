package com.bl.day3.supermarketbillingqueue;

import java.util.*;

public class CheckoutCounter {
	private Queue<Customer> queue;
	private HashMap<String, Item> inventory;

	public CheckoutCounter() {
		queue = new LinkedList<>();
		inventory = new HashMap<>();
		inventory.put("Milk", new Item("Milk", 40, 50));
		inventory.put("Bread", new Item("Bread", 30, 40));
		inventory.put("Eggs", new Item("Eggs", 6, 100));
	}

	public void addCustomer(Customer c) {
		queue.add(c);
		System.out.println("Customer added to queue.");
	}

	public void processCustomer() {
		if (queue.isEmpty()) {
			System.out.println("No customers in queue.");
			return;
		}

		Customer c = queue.poll();
		double total = 0;

		for (String itemName : c.getCart().keySet()) {
			int qty = c.getCart().get(itemName);
			Item item = inventory.get(itemName);

			if (item != null && item.getStock() >= qty) {
				total += item.getPrice() * qty;
				item.reduceStock(qty);
			} else {
				System.out.println("Item unavailable: " + itemName);
			}
		}

		System.out.println("Bill for " + c.getName() + " = ₹" + total);
	}
}

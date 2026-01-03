package com.bl.day1.onlineshoppingcart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataStructureExample {
	public static void main(String[] args) {

		// Shopping Cart
		List<Item> cart = new ArrayList<>();
		cart.add(new Item("Laptop", 50000));
		cart.add(new Item("Mouse", 500));

		// Map
		Map<String, List<Book>> booksByAuthor = new HashMap<>();
		booksByAuthor.put("Author1", new ArrayList<>());
		booksByAuthor.get("Author1").add(new Book("Book A"));

		// StringBuilder
		StringBuilder sb = new StringBuilder("Java");
		sb.append(" Practice");

		// Frequency using Map
		String[] words = "java java spring".split(" ");
		Map<String, Integer> freq = new HashMap<>();
		for (String w : words) {
			freq.put(w, freq.getOrDefault(w, 0) + 1);
		}

		// Employee List
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "Amit"));
	}
}

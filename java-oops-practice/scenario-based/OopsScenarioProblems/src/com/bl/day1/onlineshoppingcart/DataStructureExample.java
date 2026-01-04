package com.bl.day1.onlineshoppingcart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DataStructureExample {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// list for shopping Cart
		List<Item> cart = new ArrayList<>();
		System.out.print("Enter number of items: ");
		int itemCount = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < itemCount; i++) {
			System.out.print("Item name: ");
			String name = sc.nextLine();
			System.out.print("Item price: ");
			int price = sc.nextInt();
			sc.nextLine();
			cart.add(new Item(name, price));
		}

		// Map Books by Author
		Map<String, List<Book>> booksByAuthor = new HashMap<>();
		System.out.print("Enter author name: ");
		String author = sc.nextLine();

		booksByAuthor.put(author, new ArrayList<>());

		System.out.print("Enter number of books: ");
		int bookCount = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < bookCount; i++) {
			System.out.print("Book title: ");
			booksByAuthor.get(author).add(new Book(sc.nextLine()));
		}

		// StringBuilder
		System.out.print("Enter base string: ");
		StringBuilder sb = new StringBuilder(sc.nextLine());
		System.out.print("Enter string to append: ");
		sb.append(sc.nextLine());

		// Frequency using Map
		System.out.print("Enter sentence: ");
		String[] words = sc.nextLine().split(" ");
		Map<String, Integer> freq = new HashMap<>();

		for (String w : words) {
			freq.put(w, freq.getOrDefault(w, 0) + 1);
		}

		// Employee List
		List<Employee> employees = new ArrayList<>();
		System.out.print("Enter employee id: ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter employee name: ");
		String empName = sc.nextLine();

		employees.add(new Employee(id, empName));

		sc.close();

	}
}

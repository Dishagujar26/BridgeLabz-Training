package com.bl.day6.digitalbookstoresystem;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Book Type (1.EBook 2.Printed): ");
		int type = sc.nextInt();

		System.out.print("Quantity: ");
		int qty = sc.nextInt();

		Book book;
		IDiscountable discount;

		if (type == 1) {
			book = new EBook("Java Mastery", "James", 500);
			discount = (EBook) book;
		} else {
			book = new PrintedBook("Java Mastery", "James", 500, 10);
			discount = (PrintedBook) book;
		}

		if (book.reduceStock(qty)) {
			double total = discount.applyDiscount(book.getPrice()) * qty;
			System.out.println("Order Placed!");
			System.out.println("Total Cost: " + total);
		} else {
			System.out.println("Insufficient Stock!");
		}
	}
}

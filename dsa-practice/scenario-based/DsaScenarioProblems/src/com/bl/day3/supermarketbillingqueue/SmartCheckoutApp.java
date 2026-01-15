package com.bl.day3.supermarketbillingqueue;

/*9. SmartCheckout – Supermarket Billing Queue (Queue + HashMap)
Story: At a supermarket, each checkout counter maintains a Queue of customers. Each
customer has a list of items, and a HashMap is used to fetch price and stock quickly.
Requirements:
● Add/remove customers from the queue.
● Fetch item prices from map.
● Update stock on purchase.
*/

import java.util.*;

public class SmartCheckoutApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CheckoutCounter counter = new CheckoutCounter();

		while (true) {
			System.out.println("\n1.Add Customer  2.Process Customer  3.Exit");
			int ch = sc.nextInt();
			sc.nextLine();

			if (ch == 1) {
				System.out.print("Enter customer name: ");
				Customer c = new Customer(sc.nextLine());

				System.out.println("Enter items (name qty), type done:");
				while (true) {
					String line = sc.nextLine();
					if (line.equalsIgnoreCase("done"))
						break;
					String[] parts = line.split(" ");
					c.addItem(parts[0], Integer.parseInt(parts[1]));
				}
				counter.addCustomer(c);
			} else if (ch == 2) {
				counter.processCustomer();
			} else
				break;
		}
	}
}

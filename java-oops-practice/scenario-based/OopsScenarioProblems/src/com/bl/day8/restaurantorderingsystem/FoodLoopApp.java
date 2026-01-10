package com.bl.day8.restaurantorderingsystem;

import java.util.Scanner;

public class FoodLoopApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the FoodLoop Application");
		System.out.println("Enter the category of food you would like to enter\n1. Veg\n2. Non-veg\n3. Combo");
		int choice = sc.nextInt();
		sc.nextLine();
		FoodItem f;
		Order o = new Order();

		if (choice == 1) {
			String category = "Veg";
			char ch;
			do {
				System.out.println("1. Paneer Butter Masala/Shahi Paneer: ₹180 - ₹400"
						+ "\n2. Dal Makhani/Dal Tadka: ₹150 - ₹300" + "\n3. Aloo Gobi/Mix Veg Curry: ₹120 - ₹250"
						+ "\n4. Palak Paneer: ₹160 - ₹350" + "\n5. Chole Bhature/Chana Masala: ₹100 - ₹220");
				System.out.println("Enter the Item name: ");
				String name = sc.nextLine();

				System.out.println("Enter the price: ");
				double price = sc.nextDouble();
				f = new VegItem(name, category, price);
				o.addItem(f);

				System.out.println("Do you want to add more food items? (y/n)");
				ch = sc.next().charAt(0);
				ch = Character.toLowerCase(ch);
			} while (ch == 'y');
		} else if (choice == 2) {
			String category = "Non - Veg";
			char ch;
			do {
				System.out.println("1. Chicken Biryani (serves 1)	₹180 - ₹400"
						+ "\n2. Mutton Biryani (serves 1)	₹350 - ₹500" + "\n3. Butter Chicken	₹250 - ₹450"
						+ "\n4. Mutton Rogan Josh	₹300 - ₹550" + "\n5. Prawns Curry  ₹250 - ₹450");
				System.out.println("Enter the Item name: ");
				String name = sc.nextLine();

				System.out.println("Enter the price: ");
				double price = sc.nextDouble();
				f = new VegItem(name, category, price);
				o.addItem(f);

				System.out.println("Do you want to add more food items? (y/n)");
				ch = sc.next().charAt(0);
				ch = Character.toLowerCase(ch);
			} while (ch == 'y');
		} else if (choice == 3) {
			System.out.println("Combo feature is under construction!!");
			return;
		} else {
			System.out.println("Invalid choice!!");
		}
		System.out.println("Do you wnat to place order?\n1. Yes\n2. No");
		choice = sc.nextInt();
		if (choice == 1) {
			o.placeOrder();
		} else {
			System.out.println("Why the hell you wasted our time :)");
		}

	}

}

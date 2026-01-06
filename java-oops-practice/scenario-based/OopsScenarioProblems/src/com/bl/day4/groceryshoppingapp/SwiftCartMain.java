package com.bl.day4.groceryshoppingapp;

import java.util.Scanner;

public class SwiftCartMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Cart cart = new Cart();
		while (true) {
			System.out.println("1.Perishable\n2.Non-Perishable\n3.Generate Bill\n4.Exit");
			int choice = sc.nextInt();
			Product p;
			if (choice == 1) {
				System.out.println("Enter the product name: ");
				String pname = sc.next();

				System.out.println("Enter the product price: ");
				double pprice = sc.nextDouble();

				System.out.println("Enter the product quantity: ");
				int pqnty = sc.nextInt();

				p = new PerishableProduct(pname, pprice, pqnty);
				cart.addProduct(p);
			}
			else if (choice == 2) {
				System.out.println("Enter the product name: ");
				String pname = sc.next();

				System.out.println("Enter the product price: ");
				double pprice = sc.nextDouble();

				System.out.println("Enter the product quantity: ");
				int pqnty = sc.nextInt();

				p = new NonPerishableProduct(pname, pprice, pqnty);
				cart.addProduct(p);

			}
			else if(choice == 3){
				cart.generateBill();
				break;
			}
			else if(choice == 4){
				System.out.println("Thank You!!");
				break;
			}	
		}
     sc.close();
	}
	
}

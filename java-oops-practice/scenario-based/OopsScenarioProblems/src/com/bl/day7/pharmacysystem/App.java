package com.bl.day7.pharmacysystem;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Which medicine you want to sell\n1.Tablet\n2.Syrup\n3.Injection");
		int choice = sc.nextInt();
		sc.nextLine();
		Medicine m;
		if(choice == 1) {
			System.out.print("Enter medicine name: ");
			String name = sc.nextLine();

			System.out.print("Enter medicine price: ");
			double price = sc.nextDouble();
			sc.nextLine();

	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			System.out.println("Enter a date in yyyy-MM-dd format ");
			String dateInput = sc.nextLine();
			try {
				LocalDate expiryDate = LocalDate.parse(dateInput, formatter);
				m = new Tablet(name,expiryDate,price);
				System.out.println("What do want to do?\n1.Check Expiry Date\n2.Sell the medicine");
				choice = sc.nextInt();
				sc.nextLine();
				if(choice == 1) {
					m.checkExpiry();
				}
				else if(choice == 2){
					System.out.println("Enter the medicine quantity: ");
					int qnty = sc.nextInt();
					m.sell(qnty);
				}
				else {
					System.out.println("Invalid choice!!");
				}
			}
			catch (DateTimeParseException e) {
                System.out.println("Invalid date forma, Try again!!:");
            }
		
		}
		else if(choice == 2) {
			System.out.print("Enter medicine name: ");
			String name = sc.nextLine();

			System.out.print("Enter medicine price: ");
			double price = sc.nextDouble();
			sc.nextLine();

	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			System.out.println("Enter a date in yyyy-MM-dd format ");
			String dateInput = sc.nextLine();
			try {
				LocalDate expiryDate = LocalDate.parse(dateInput, formatter);
				m = new Syrup(name,expiryDate,price);
				System.out.println("What do want to do?\n1.Check Expiry Date\n2.Sell the medicine");
				choice = sc.nextInt();
				
				if(choice == 1) {
					m.checkExpiry();
				}
				else if(choice == 2){
					System.out.println("Enter the medicine quantity: ");
					int qnty = sc.nextInt();
					m.sell(qnty);
				}
				else {
					System.out.println("Invalid choice!!");
				}
			}
			catch (DateTimeParseException e) {
                System.out.println("Invalid date forma, Try again!!:");
            }
		
		}
		else if(choice == 3) {
			System.out.print("Enter medicine name: ");
			String name = sc.nextLine();

			System.out.print("Enter medicine price: ");
			double price = sc.nextDouble();
			sc.nextLine();

	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			System.out.println("Enter a date in yyyy-MM-dd format ");
			String dateInput = sc.nextLine();
			try {
				LocalDate expiryDate = LocalDate.parse(dateInput, formatter);
				m = new Injection(name,expiryDate,price);
				System.out.println("What do want to do?\n1.Check Expiry Date\n2.Sell the medicine");
				choice = sc.nextInt();
				
				if(choice == 1) {
					m.checkExpiry();
				}
				else if(choice == 2){
					System.out.println("Enter the medicine quantity: ");
					int qnty = sc.nextInt();
					m.sell(qnty);
				}
				else {
					System.out.println("Invalid choice!!");
				}
			}
			catch (DateTimeParseException e) {
                System.out.println("Invalid date forma, Try again!!:");
            }
		
		}
		else {
			System.out.println("Invalid choice!!");
		}
     sc.close();
	}

}

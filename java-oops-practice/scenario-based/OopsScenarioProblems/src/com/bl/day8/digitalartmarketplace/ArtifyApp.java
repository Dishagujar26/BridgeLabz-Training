package com.bl.day8.digitalartmarketplace;

import java.util.Scanner;

public class ArtifyApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Which art you want to either license or purchase?\n1.Digital Art\n2.Print Art");
		int choice = sc.nextInt();
		sc.nextLine();
		
		System.out.println("What's your name: ");
		String username = sc.nextLine();
		System.out.println("What's you wallet balance: ");
		double balance = sc.nextDouble();
		sc.nextLine();
		
		User u = new User(username,balance);
		
		Artwork a;
		if(choice == 1) {
			System.out.println("Enter the title of your art: ");
			String title = sc.nextLine();
			
			System.out.println("Enter the artist name: ");
			String artist = sc.nextLine();
			
			System.out.println("Enter the price of the art: ");
			double price = sc.nextDouble();
			sc.nextLine();
			
			a = new DigitalArt(title,artist,price);
			System.out.println("Do you want to purchase or license?\n1.Purchase\n2.License");
			choice = sc.nextInt();
			sc.nextLine();
			
			if(choice == 1) {
				a.purchase(u);
			}
			else if(choice == 2) {
				a.license();
			}	
		}
		else if(choice == 2) {
			System.out.println("Enter the title of your art: ");
			String title = sc.nextLine();
			
			System.out.println("Enter the artist name: ");
			String artist = sc.nextLine();
			
			System.out.println("Enter the price of the art: ");
			double price = sc.nextDouble();
			sc.nextLine();
			
			a = new DigitalArt(title,artist,price);
			System.out.println("Do you want to purchase or license?\n1.Purchase\n2.License");
			choice = sc.nextInt();
			sc.nextLine();
			
			if(choice == 1) {
				a.purchase(u);
			}
			else if(choice == 2) {
				a.license();
			}
 			
		}
		sc.close();
	}

}

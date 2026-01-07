package com.bl.day5.petpalapplication;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    Pet pet;
		System.out.println("WHo is your pet?\n1.Cat\n2.Dog\n3.Bird");

		int choice = sc.nextInt();
		sc.nextLine();
		if(choice == 1) {
			System.out.println("What's the name of your pet: ");
			String name = sc.nextLine();	
			pet = new Cat(name);
			System.out.println("What you want your pet to do?\n1.Make Sound\n2.Feed\n3.Play\n4.Show Status");
			choice = sc.nextInt();
			sc.nextLine();

			if(choice == 1) {
				pet.makeSound();
			} 
			else if(choice == 2) {
				pet.feed();
			}
			else if(choice == 3) {
				pet.play();
			}
			else if(choice == 4) {
				pet.showStatus();
			}
			else {
				System.out.println("Wrong choice!!");
			}

		}
		else if(choice == 2) {
			System.out.println("What's the name of your pet: ");
			String name = sc.nextLine();	
			pet = new Dog(name);
			System.out.println("What you want your pet to do?\n1.Make Sound\n2.Feed\n3.Play\n4.Show Status");
			choice = sc.nextInt();
			sc.nextLine();
			if(choice == 1) {
				pet.makeSound();
			} 
			else if(choice == 2) {
				pet.feed();
			}
			else if(choice == 3) {
				pet.play();
			}
			else if(choice == 4) {
				pet.showStatus();
			}
			else {
				System.out.println("Wrong choice!!");
			}
		}
		else if(choice == 3) {
			System.out.println("What's the name of your pet: ");
			String name = sc.nextLine();	
			pet = new Bird(name);
			System.out.println("What you want your pet to do?\n1.Make Sound\n2.Feed\n3.Play\n4.Show Status");
			choice = sc.nextInt();
			sc.nextLine();

			if(choice == 1) {
				pet.makeSound();
			} 
			else if(choice == 2) {
				pet.feed();
			}
			else if(choice == 3) {
				pet.play();
			}
			else if(choice == 4) {
				pet.showStatus();
			}
			else {
				System.out.println("Wrong choice!!");
			}
		}
		else {
			System.out.println("Invalid!!");
		}
	}
}
		
	



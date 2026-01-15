package com.bl.day3.roundaboutvehicleflow;

import java.util.Scanner;

public class TrafficManagerMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TrafficManagement tm = new TrafficManagement();
		System.out.println("Welcome to the Traffic Manager System ");
		while(true) {
			System.out.println("What you wanna do?\n1. Add Car To Roundabout\n2. Remove Car From Roundabout\n3. Print Waiting Queue\n4. Print Roundabout\n5. Exit");
			int choice = sc.nextInt();
			sc.nextLine();
			
			if(choice == 1) {
				System.out.println("Enter the car number: ");
				int no = sc.nextInt();
				tm.addCarToRoundabout(no);
				
			}
			else if(choice == 2) {
				System.out.println("Enter the car number: ");
				int no = sc.nextInt();
				tm.removeCarToRoundabout(no);
				
			}
			else if(choice == 3) {
				tm.displayWq();	
			}
			else if(choice == 4) {
				tm.displayRoundabout();	
			}
			else if(choice == 5) {
				System.out.println("Thank you for using me :)");
				break;
			}
			else {
				System.out.println("Invalid Choice!!");
				break;
			}
		}
		sc.close();
	}

}

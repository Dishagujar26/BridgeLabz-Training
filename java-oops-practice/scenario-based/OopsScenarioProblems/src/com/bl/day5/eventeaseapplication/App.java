package com.bl.day5.eventeaseapplication;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Event e1;
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter email: ");
		String email = sc.nextLine();
		
		System.out.println("Enter cell number: ");
		String cell = sc.next();
		
		User user = new User(name,  email, cell);// organizer
		System.out.println("Which Event You Want to Schedule\n1.Birthday\n2.Conference");
		int choice = sc.nextInt();
		
		if(choice == 1) {
			System.out.println("Enter event id: ");
			int eventId = sc.nextInt();
			
			System.out.println("Enter Location: ");
			String location = sc.next();
			
			System.out.println("Enter event date: ");
			String date = sc.next();
			
			System.out.println("Enter the number of atendes: ");
			int attendece = sc.nextInt();
			
		    e1 = new BirthdayEvent(eventId, location, date, attendece, user);
			e1.schedule();
			System.out.println("Total Cost: " + e1.calculateTotalCost());
			System.out.println("You want to reschedue\n1.yes\n2.no ");
			choice = sc.nextInt();
			if(choice == 1) {
				e1.reschedule("10-03-2026");
				System.out.println("Total Cost: " + e1.calculateTotalCost());
			}
			else {
				System.out.println("Thank You!!");
			}

		}
		else if(choice == 2) {
			System.out.println("Enter event id: ");
			int eventId = sc.nextInt();
			
			System.out.println("Enter Location: ");
			String location = sc.next();
			
			System.out.println("Enter event date: ");
			String date = sc.next();
			
			System.out.println("Enter the number of atendes: ");
			int attendece = sc.nextInt();
			
			e1 = new ConferenceEvent(eventId, location, date, attendece, user);
			e1.schedule();
			System.out.println("Total Cost: " + e1.calculateTotalCost());
			System.out.println("You want to reschedue\n1.yes\n2.no ");
			choice = sc.nextInt();
			if(choice == 1) {
				e1.reschedule("10-03-2026");
				System.out.println("Total Cost: " + e1.calculateTotalCost());
			}
			else {
				System.out.println("Thank You!!");
			}
		}
		sc.close();
	}
}

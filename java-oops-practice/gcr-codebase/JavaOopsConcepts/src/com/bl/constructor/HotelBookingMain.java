package com.bl.constructor;

import java.util.Scanner;

public class HotelBookingMain {
     
	public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Guest Name ");
		String guestName = sc.nextLine();
		
		System.out.println("Enter Room Type ");
		String roomType = sc.nextLine();
		
		System.out.println("Enter Total Number of Nights ");
		int nights = sc.nextInt();
		
	  
		// default values
		HotelBooking hotelbooking1 = new HotelBooking();
		hotelbooking1.displayBookingDetails();
		
		System.out.println("---------------------------------------");
		
		// parameterized constructor 
		HotelBooking hotelbooking2 = new HotelBooking(guestName,roomType,nights);
		hotelbooking2.displayBookingDetails();
		
		System.out.println("---------------------------------------");

		// copy constructor 
		HotelBooking hotelbooking3 = new HotelBooking(hotelbooking2);
		hotelbooking3.displayBookingDetails();
		
		sc.close();
	}
}

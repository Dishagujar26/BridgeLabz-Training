package com.bl.constructor;

public class HotelBooking {
	
	String guestName;
	String roomType;
	int nights;
	
	// parameterized constructor 
	HotelBooking(String guestName, String roomType, int nights){
		this.guestName = guestName;
		this.roomType = roomType;
		this.nights = nights;
	}
	
    // default constructor
	HotelBooking() {
		
	}
	
	// copy constructor
	HotelBooking(HotelBooking hotelbookings){
		this.guestName = hotelbookings.guestName;
		this.roomType = hotelbookings.roomType;
		this.nights = hotelbookings.nights;
	}
	
	// Display Booking Details
    void displayBookingDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Total Nights Staying: " + nights);
    }
}

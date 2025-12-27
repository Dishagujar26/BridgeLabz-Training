package com.bl.constructor;

public class CarRental{
	
	String customerName;
	String carModel;
	int rentalDays;
	double totalCost;
	
	// constructor to initialize the rental details
	CarRental(String customerName, String carModel, int rentalDays) {
		this.carModel = carModel;
		this.customerName = customerName; 
		this.rentalDays = rentalDays;
		this.totalCost = calculateTotalCost();
	}
	
	// calculate the total cost of renting 
	double calculateTotalCost() {
		double rentPerDay = 0.0;
		
		switch(carModel.toLowerCase()) {
		    
		case "sedan":
			rentPerDay = 1200;
			break;
			
		case "swift":
			rentPerDay = 300;
			break;
		
		case "Tufan":
			rentPerDay = 1300;
			break;
		
		case "Scorpio":
			rentPerDay = 2500;
			break;
			
		default:
			//default rate 
			rentPerDay = 5000;
		}
		
		return rentPerDay * rentalDays;
	}
	
	// Display rental details
    void displayDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + totalCost);
    }
}

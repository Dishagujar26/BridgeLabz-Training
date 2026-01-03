package com.bl.day2.hospitalmanagementsystem;

public class Bill implements Payable{
	
	    double amount;
	    double tax = 0.10;
	    double discount = 0.05;

	    Bill(double amount) {
	        this.amount = amount;
	    }

	    @Override
	    public double calculatePayment() {
	        return amount + (amount * tax) - (amount * discount);
	    }

}

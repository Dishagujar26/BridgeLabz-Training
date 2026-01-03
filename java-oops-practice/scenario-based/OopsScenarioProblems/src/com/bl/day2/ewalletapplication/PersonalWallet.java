package com.bl.day2.ewalletapplication;

public class PersonalWallet extends Wallet{
	  PersonalWallet(double amount) {
	        super(amount);
	    }

	    @Override
	    public void transferTo(User receiver, double amount) {
	        double tax = amount * 0.02;
	        if (debit(amount + tax)) {
	            receiver.getWallet().credit(amount);
	        }
	    }
}

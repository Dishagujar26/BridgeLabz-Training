package com.bl.day2.ewalletapplication;

public class BusinessWallet extends Wallet {
	
	BusinessWallet(double amount) {
	        super(amount);
	    }

	@Override
	public void transferTo(User receiver, double amount) {
		double tax = amount * 0.05;
		if (debit(amount + tax)) {
			receiver.getWallet().credit(amount);
		}
	}
}

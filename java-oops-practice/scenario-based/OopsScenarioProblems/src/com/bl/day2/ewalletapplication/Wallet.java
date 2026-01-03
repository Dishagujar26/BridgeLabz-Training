package com.bl.day2.ewalletapplication;

public abstract class Wallet implements Transferrable{
	 private double balance;

	    Wallet(double initialAmount) {
	        this.balance = initialAmount;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    protected void credit(double amount) {
	        balance += amount;
	    }

	    protected boolean debit(double amount) {
	        if (balance >= amount) {
	            balance -= amount;
	            return true;
	        }
	        return false;
	    }
}

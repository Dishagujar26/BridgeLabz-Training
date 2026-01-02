package com.bl.encapsulation.bankingsystem;

public abstract class BankAccount {
	private String accountNumber;
	private String holderName;
	private double balance;

	public BankAccount(String accountNumber, String holderName, double balance) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
	}

	// Encapsulation
	public double getBalance() {
		return balance;
	}

	protected void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		if (amount > 0)
			balance += amount;
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance)
			balance -= amount;
	}

	public abstract double calculateInterest();

}

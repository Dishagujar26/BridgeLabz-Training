package com.bl.inheritance.hierarchicalinheritance.bankaccounttypes;

public class SavingsAccount extends BankAccount {

	double interestRate;

	public SavingsAccount(int accountNumber, double balance, double interestRate) {
		super(accountNumber, balance);
		this.interestRate = interestRate;
	}

	void displayAccountType() {
		System.out.println("Savings Account");
	}
}

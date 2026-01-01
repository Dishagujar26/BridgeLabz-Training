package com.bl.inheritance.hierarchicalinheritance.bankaccounttypes;

public class CheckingAccount extends BankAccount {
	int withdrawalLimit;

	public CheckingAccount(int accountNumber, double balance, int withdrawalLimit) {
		super(accountNumber, balance);
		this.withdrawalLimit = withdrawalLimit;
	}

	void displayAccountType() {
		System.out.println("Checking Account");
	}
}

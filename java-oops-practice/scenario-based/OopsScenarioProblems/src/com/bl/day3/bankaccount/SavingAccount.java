package com.bl.day3.bankaccount;

public class SavingAccount extends Account implements Transaction {

	double interestRate = 5;

	public SavingAccount(int accountNumber, double balance) {
		super(accountNumber, balance);

	}

	@Override
	public void deposit(double amount) {
		setBalance(getBalance() + amount);

	}

	@Override
	public void withdraw(double amount) {
		if (getBalance() > amount && getBalance() - amount != 0) {
			setBalance(getBalance() - amount);
		}
		else {
			System.out.println("Insufficient  Balance!!!");
		}
	}

	@Override
	double calculateInterest() {
		return getBalance() * interestRate / 100;

	}

	@Override
	public void checkBalance() {
		System.out.println(getBalance());

	}

}

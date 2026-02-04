package com.bl.practiceproblems.raceconditiondemo;

public class Transaction implements Runnable {
	private BankAccount account;
	private int amount;
	private String customer;

	Transaction(BankAccount account, int amount, String customer) {
		this.account = account;
		this.amount = amount;
		this.customer = customer;
	}

	public void run() {
		System.out.println("[" + customer + "] Attempting to withdraw " + amount);
		if (account.withdraw(amount)) {
			System.out.println("Transaction successful: " + customer + ", Amount: " + amount + ", Balance: "
					+ account.getBalance());
		} else {
			System.out.println("Transaction failed: " + customer);
		}
	}
}
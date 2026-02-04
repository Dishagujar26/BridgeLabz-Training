package com.bl.practiceproblems.raceconditiondemo;

public class BankAccount {
	private int balance = 10000;

	synchronized boolean withdraw(int amount) {
		if (balance >= amount) {
			balance -= amount;
			return true;
		}
		return false;
	}

	int getBalance() {
		return balance;
	}
}

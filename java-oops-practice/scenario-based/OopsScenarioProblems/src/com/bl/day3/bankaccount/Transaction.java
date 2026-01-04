package com.bl.day3.bankaccount;

public interface Transaction {
	public void deposit(double amount);
	public void withdraw(double amount);
	public void checkBalance();
}

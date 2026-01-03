package com.bl.day1.bankaccount;

public class Bank {
	public class BankApp {
	    public static void main(String[] args) {
	        Account acc1 = new SavingAccount(101, 1000);
	        Account acc2 = new CurrentAccount(102, 2000);

	        acc1.deposit(500);
	        acc1.calculateInterest();

	        acc2.withdraw(300);

	        System.out.println("Savings Balance: " + acc1.getBalance());
	        System.out.println("Current Balance: " + acc2.getBalance());
	    }
	}
}

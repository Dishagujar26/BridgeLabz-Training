package com.bl.objectmodeling.assistedproblems.problem2;

public class Bank {
	String bankName;

	Bank(String bankName) {
		this.bankName = bankName;
	}

	Account openAccount(int accNo, double balance) {
		System.out.println("Account opened in " + bankName);
		return new Account(accNo, balance);
	}
}

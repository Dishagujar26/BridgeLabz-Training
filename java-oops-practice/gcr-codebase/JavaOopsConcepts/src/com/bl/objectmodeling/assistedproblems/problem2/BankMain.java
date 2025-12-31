package com.bl.objectmodeling.assistedproblems.problem2;

public class BankMain {
	public static void main(String[] args) {

		// Association is a relationship where two independent classes communicate with
		// each other, both exist independently

		Bank bank = new Bank("HDFC Bank");

		Customers customer = new Customers("Disha");

		Account acc = bank.openAccount(101, 50000);

		customer.linkAccount(acc);
		customer.viewBalance();
	}
}

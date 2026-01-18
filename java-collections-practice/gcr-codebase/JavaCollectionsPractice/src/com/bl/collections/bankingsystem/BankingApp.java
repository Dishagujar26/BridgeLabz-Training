package com.bl.collections.bankingsystem;

public class BankingApp {

	public static void main(String[] args) {
		BankingSystem bank = new BankingSystem();
		bank.addAccount("A001", 5000);
		bank.addAccount("A002", 2000);
		bank.addAccount("A003", 7000);

		bank.addWithdrawalRequest("A001", 1000);
		bank.addWithdrawalRequest("A002", 2500); // insufficient
		bank.processRequests();

		bank.displayAccountsSortedByBalance();

	}
}

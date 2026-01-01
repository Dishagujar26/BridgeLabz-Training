package com.bl.inheritance.hierarchicalinheritance.bankaccounttypes;

public class BankAccountMain {

	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount(101, 50000, 4.5);
		CheckingAccount ca = new CheckingAccount(102, 20000, 10000);
		FixedDepositAccount fd = new FixedDepositAccount(103, 100000, 5);

		sa.displayAccountType();
		ca.displayAccountType();
		fd.displayAccountType();
	}
}

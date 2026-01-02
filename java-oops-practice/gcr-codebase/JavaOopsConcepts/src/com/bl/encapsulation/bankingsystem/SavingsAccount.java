package com.bl.encapsulation.bankingsystem;

public class SavingsAccount extends BankAccount implements Loanable{
	public SavingsAccount(String accNo, String name, double balance) {
		super(accNo, name, balance);
	}

	public double calculateInterest() {
		return getBalance() * 0.04; // 4% interest
	}

	public void applyForLoan() {
		System.out.println("Savings Account Loan Applied");
	}

	public double calculateLoanEligibility() {
		return getBalance() * 5;
	}

}

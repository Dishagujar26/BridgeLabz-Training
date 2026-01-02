package com.bl.encapsulation.bankingsystem;

public class BankService {
	public static void main(String[] args) {

		BankAccount[] accounts = { new SavingsAccount("SB101", "Amit", 50000),
				new CurrentAccount("CA201", "Riya", 100000) };

		for (BankAccount acc : accounts) {
			System.out.println("Interest: ₹" + acc.calculateInterest());

			if (acc instanceof Loanable) {
				Loanable loanAcc = (Loanable) acc;
				loanAcc.applyForLoan();
				System.out.println("Loan Eligibility: ₹" + loanAcc.calculateLoanEligibility());
			}
		}
	}
}

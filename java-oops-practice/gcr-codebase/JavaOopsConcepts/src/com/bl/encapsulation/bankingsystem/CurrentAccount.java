package com.bl.encapsulation.bankingsystem;

public class CurrentAccount extends BankAccount implements Loanable{
	public CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    public double calculateInterest() {
        return getBalance() * 0.02; // 2% interest
    }

    public void applyForLoan() {
        System.out.println("Current Account Loan Applied");
    }

    public double calculateLoanEligibility() {
        return getBalance() * 10;
    }

}

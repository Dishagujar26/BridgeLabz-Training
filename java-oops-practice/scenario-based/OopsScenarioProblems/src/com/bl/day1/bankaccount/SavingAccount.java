package com.bl.day1.bankaccount;

public class SavingAccount extends Account {

	private double interestRate = 0.04;

	public SavingAccount(int accNo, double balance) {
        super(accNo, balance);
    }
	
	@Override
	void calculateInterest() {
		double interest = getBalance() * interestRate;
		setBalance(getBalance() + interest);
	}

}

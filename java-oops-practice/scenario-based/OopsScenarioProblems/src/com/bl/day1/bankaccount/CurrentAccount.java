package com.bl.day1.bankaccount;

public class CurrentAccount extends Account{

	public CurrentAccount(int accNo, double balance) {
		super(accNo, balance);
	}

	@Override
	void calculateInterest() {
		// No interest for current account
	}
}

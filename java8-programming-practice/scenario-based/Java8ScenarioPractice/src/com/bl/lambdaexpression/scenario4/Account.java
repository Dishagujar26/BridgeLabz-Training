package com.bl.lambdaexpression.scenario4;

public class Account {
	String accNo;
	double balance;
	double rate;

	Account(String accNo, double balance, double rate) {
		this.accNo = accNo;
		this.balance = balance;
		this.rate = rate;
	}

	@Override
	public String toString() {
		return accNo + "-" + balance;
	}
}
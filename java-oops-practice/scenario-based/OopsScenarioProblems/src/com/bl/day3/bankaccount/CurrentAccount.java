package com.bl.day3.bankaccount;

public class CurrentAccount extends Account implements Transaction{
	
	public CurrentAccount(int accountNumber, double balance) {
		super(accountNumber, balance);
	}

	@Override
	public void deposit(double amount) {
		setBalance(getBalance()+amount);
		
	}

	@Override
	public void withdraw(double amount) {
		setBalance(getBalance() - amount);
		
	}

	@Override
	double calculateInterest(){
		return 0.0;
	}

	@Override
	public void checkBalance() {
	System.out.print( getBalance());
		
	}
}

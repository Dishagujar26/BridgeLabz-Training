package com.bl.constructor;

public class BankAccount {
	
    public long accountNumber;       
    protected String accountHolder;   
    private double balance;           

    // Constructor
    BankAccount(long accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public methods to access private balance
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

}

class SavingsAccount extends BankAccount {

    double interestRate;

    SavingsAccount(long accountNumber, String accountHolder,double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    void displaySavingsAccount() {
        System.out.println("Account Number: " + accountNumber);   
        System.out.println("Account Holder: " + accountHolder);  
        System.out.println("Balance: ₹" + getBalance());        
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

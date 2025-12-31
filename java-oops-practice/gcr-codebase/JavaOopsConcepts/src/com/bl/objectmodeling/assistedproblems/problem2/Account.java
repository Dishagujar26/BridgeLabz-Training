package com.bl.objectmodeling.assistedproblems.problem2;

public class Account {

	int accountNumber;
    double balance;

    Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    double getBalance() {
        return balance;
    }
}

package com.bl.objectmodeling.assistedproblems.problem2;

public class Customers {
	String name;
    Account account;

    Customers(String name) {
        this.name = name;
    }

    void linkAccount(Account account) {
        this.account = account;
    }

    void viewBalance() {
        System.out.println("Customer: " + name);
        System.out.println("Balance: ₹" + account.getBalance());
    }
}

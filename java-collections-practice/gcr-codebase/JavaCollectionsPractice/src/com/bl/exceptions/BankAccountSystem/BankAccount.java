package com.bl.exceptions.BankAccountSystem;

import java.util.Scanner;

public class BankAccount {

	double balance;

	public void deposit(double amount) {
		if (amount < 0) {
			throw new IllegalArgumentException("Invalid amount!");
		}
		this.balance += amount;
	}

	public void withdraw(double amount) throws InsufficientBalanceException {
		if (amount < 0) {
			throw new IllegalArgumentException("Invalid amount!");
		}
		if (amount > balance) {
			throw new InsufficientBalanceException("Insufficient balance!");
		} else {
			this.balance -= amount;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankAccount obj = new BankAccount();

		System.out.println("1. Deposit Money\n2. Withdraw Money");
		int choice = sc.nextInt();
		sc.nextLine();
		try {
			if (choice == 1) {
				System.out.println("Enter the amount you want to add: ");
				double amt = sc.nextDouble();
				obj.deposit(amt);
				System.out.println("Amount deposited successfully\nCurrent balance " + obj.balance);
			} else if (choice == 2) {
				System.out.println("Enter the amount you want to withdraw: ");
				double amt = sc.nextDouble();
				obj.withdraw(amt);
				System.out.println("Amount withdraw successfully\nCurrent balance " + obj.balance);
			} else {
				System.out.println("Invalid choice");
			}

		} catch (InsufficientBalanceException e) {
			e.getMessage();
		} catch (IllegalArgumentException e) {
			e.getMessage();
		}
	}

}

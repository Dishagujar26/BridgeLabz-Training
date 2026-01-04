package com.bl.day1.bankaccount;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Savings Account Number: ");
		int sAccNo = sc.nextInt();

		System.out.print("Enter Initial Savings Balance: ");
		double sBalance = sc.nextDouble();

		Account acc1 = new SavingAccount(sAccNo, sBalance);

		System.out.print("Enter amount to deposit in Savings: ");
		double depositAmt = sc.nextDouble();
		acc1.deposit(depositAmt);

		acc1.calculateInterest();

		// Current Account input
		System.out.print("\nEnter Current Account Number: ");
		int cAccNo = sc.nextInt();

		System.out.print("Enter Initial Current Balance: ");
		double cBalance = sc.nextDouble();

		Account acc2 = new CurrentAccount(cAccNo, cBalance);

		System.out.print("Enter amount to withdraw from Current: ");
		double withdrawAmt = sc.nextDouble();
		acc2.withdraw(withdrawAmt);

		// Output
		System.out.println("\nSavings Balance: " + acc1.getBalance());
		System.out.println("Current Balance: " + acc2.getBalance());

		sc.close();
	}

}

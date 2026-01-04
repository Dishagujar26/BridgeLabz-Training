package com.bl.day3.bankaccount;

import java.util.Scanner;

public class AccountMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Select the type of account\n1. Saving Account\n2. Current Account");
		int choice1 = sc.nextInt();
		if (choice1 == 1) {
			System.out.println("Enter the Account Number: ");
			int accNum = sc.nextInt();

			System.out.println("Enter your Opening Balance: ");
			double balance = sc.nextDouble();

			SavingAccount savingacc = new SavingAccount(accNum, balance);
			Transaction transaction;

			while (true) {
				System.out.println("What Operations Do You Want to Perform ");
				System.out.println("1.Deposit\n2.Withdraw\n3.Check Balance\n4.Calculate Interest\n5.Exit");
				int choice = sc.nextInt();

				switch (choice) {

				case 1:
					transaction = savingacc;
					System.out.println("Enter the amount you want to deposit");
					double amount = sc.nextDouble();
					transaction.deposit(amount);
					break;

				case 2:
					transaction = savingacc;
					System.out.println("Enter the amount you want to withdraw");
					double amount1 = sc.nextDouble();
					transaction.withdraw(amount1);
					break;

				case 3:
					transaction = savingacc;
					System.out.println("Your current balance is");
					transaction.checkBalance();
					break;

				case 4:
					System.out.println(savingacc.calculateInterest());
					break;

				case 5:
					System.out.println("Thank You For Using!!");
					return;
					
				default:
					System.out.println("Invalid Choice");
					break;

				}
			}
		}

		if (choice1 == 2) {

			System.out.println("Enter the Current Account Number: ");
			int accNum2 = sc.nextInt();

			System.out.println("Enter your Current Opening Balance: ");
			double balance2 = sc.nextDouble();

			CurrentAccount currentacc = new CurrentAccount(accNum2, balance2);
			Transaction transaction;

			while (true) {
				System.out.println("What Operations Do You Want to Perform ");
				System.out.println("1.Deposit\n2.Withdraw\n3.Check Balance\n4.Calculate Interest\n5.Exit");
				int choice = sc.nextInt();

				switch (choice) {

				case 1:
					transaction = currentacc;
					System.out.println("Enter the amount you want to deposit");
					double amount = sc.nextDouble();
					transaction.deposit(amount);
					break;

				case 2:
					transaction = currentacc;
					System.out.println("Enter the amount you want to withdraw");
					double amount1 = sc.nextDouble();
					transaction.withdraw(amount1);
					break;

				case 3:
					transaction = currentacc;
					System.out.println("Your current balance is");
					transaction.checkBalance();
					break;

				case 4:
					System.out.println(currentacc.calculateInterest());
					break;

					
					
					
				case 5:
					System.out.println("Thank You For Using!!");
					return;
					
				default:
					System.out.println("Invalid Choice");
					break;

				}
			}

		}
		sc.close();
	}
}

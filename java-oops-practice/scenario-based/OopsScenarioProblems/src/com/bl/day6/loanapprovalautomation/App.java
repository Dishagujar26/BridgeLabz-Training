package com.bl.day6.loanapprovalautomation;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Name: ");
		String name = sc.nextLine();

		System.out.print("Credit Score: ");
		int score = sc.nextInt();

		System.out.print("Monthly Income: ");
		double income = sc.nextDouble();

		System.out.print("Loan Amount: ");
		double amount = sc.nextDouble();

		System.out.print("Loan Type (1.Home 2.Auto): ");
		int type = sc.nextInt();

		Applicant applicant = new Applicant(name, score, income, amount);
		LoanApplication loan = (type == 1) ? new HomeLoan(applicant, 20) : new AutoLoan(applicant, 5);

		if (loan.approveLoan()) {
			System.out.println("Loan Approved!");
			System.out.println("Monthly EMI: " + loan.calculateEMI());
		} else {
			System.out.println("Loan Rejected.");
		}
	}
}

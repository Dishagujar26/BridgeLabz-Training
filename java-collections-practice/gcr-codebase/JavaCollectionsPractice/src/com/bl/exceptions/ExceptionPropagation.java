package com.bl.exceptions;

import java.util.Scanner;

public class ExceptionPropagation {

	public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
		
		 if (amount <= 0 || rate <= 0 || years <= 0) {
		        throw new IllegalArgumentException("Invalid input");
		    }
		
		return (amount * rate * years) / 100;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the amount: ");
		double amt = sc.nextDouble();
		System.out.println("Enter the rate: ");
		double rate = sc.nextDouble();
		System.out.println("Enter the year: ");
		int year = sc.nextInt();

		try {
		    double si = calculateInterest(amt, rate, year);
		    System.out.println("Simple Interest: " + si);
		} catch (IllegalArgumentException e) {
		    System.out.println("Invalid input: Amount, rate, and years must be positive");
		}


	}

}

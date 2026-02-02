package com.bl.functionalinterfaces.predicate;

import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {

		// 1. Student eligible for exam (attendance >= 75%)
		Predicate<Integer> attendanceCheck = att -> att >= 75;
		System.out.println("Eligible for exam: " + attendanceCheck.test(80));

		// 2. Salary > 30000
		Predicate<Double> salaryCheck = s -> s > 30000;
		System.out.println("Salary > 30000: " + salaryCheck.test(25000.0));

		// 3. Withdrawal amount valid (>0 and < balance)
		Predicate<Double> withdrawalCheck = amt -> amt > 0 && amt <= 1000; // example balance=1000
		System.out.println("Withdrawal valid: " + withdrawalCheck.test(500.0));

		// 4. Free delivery for order >= 1000
		Predicate<Double> freeDelivery = amt -> amt >= 1000;
		System.out.println("Free delivery: " + freeDelivery.test(1200.0));

		// 5. Even number check
		Predicate<Integer> isEven = n -> n % 2 == 0;
		System.out.println("Is 7 even? " + isEven.test(7));
	}
}

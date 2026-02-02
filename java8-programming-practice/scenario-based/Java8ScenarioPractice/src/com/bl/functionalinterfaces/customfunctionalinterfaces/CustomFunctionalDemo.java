package com.bl.functionalinterfaces.customfunctionalinterfaces;

public class CustomFunctionalDemo {
	public static void main(String[] args) {

		BonusCalculator bonus = salary -> salary * 0.1;
		System.out.println("Bonus: " + bonus.calculate(5000));

		LoanEligibility loanCheck = (salary, debt) -> salary / debt > 2;
		System.out.println("Loan Eligible: " + loanCheck.check(5000, 2000));

		TaxCalculator tax = income -> income * 0.2;
		System.out.println("Tax: " + tax.compute(10000));

		UserLoginValidator loginValidator = (user, pass) -> user.equals("admin") && pass.equals("123");
		System.out.println("Login valid: " + loginValidator.validate("admin", "123"));
	}
}
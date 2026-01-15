package com.bl.day9.personalfinancetracker;

public class AnnualBudget extends Budget implements IAnalyzable {

	public AnnualBudget(double income, double limit, java.util.HashMap<String, Double> categories) {
		super(income, limit, categories);
	}

	@Override
	public void generateReport() {
		System.out.println("===== Annual Financial Report =====");
		System.out.println("Yearly Income: " + income);
		System.out.println("Yearly Expenses: " + totalExpenses);
		System.out.println("Yearly Savings: " + getNetSavings());
	}

	@Override
	public void detectOverspend() {
		if (totalExpenses > limit) {
			System.out.println("Annual budget exceeded!");
		} else {
			System.out.println("Annual budget is under control.");
		}
	}
}

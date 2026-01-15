package com.bl.day9.personalfinancetracker;

import java.util.*;

public class Budget {
	protected double income;
	protected double totalExpenses;
	protected double limit;

	protected HashMap<String, Double> categoryLimits;
	protected ArrayList<Transaction> transactions;

	// Constructor with categories
	public Budget(double income, double limit, HashMap<String, Double> categoryLimits) {
		this.income = income;
		this.limit = limit;
		this.categoryLimits = categoryLimits;
		this.transactions = new ArrayList<>();
	}

	// Encapsulation: No direct list access
	public void addTransaction(Transaction t) {
		transactions.add(t);

		if (t.getType().equalsIgnoreCase("Expense")) {
			totalExpenses += t.getAmount();
		}
	}

	// Operator usage
	public double getNetSavings() {
		return income - totalExpenses;
	}
}

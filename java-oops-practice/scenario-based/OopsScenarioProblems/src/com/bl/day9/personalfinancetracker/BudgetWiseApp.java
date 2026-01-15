package com.bl.day9.personalfinancetracker;

/*
 *23. "BudgetWise – Personal Finance Tracker"
Story: BudgetWise helps users plan monthly budgets and track income/expenses across
categories.
Requirements:
● Transaction class: amount, type, date, category.
● Budget class: income, limit, categoryLimits[].
● Interface IAnalyzable with generateReport() and detectOverspend().
● Constructors for monthly budgets with custom categories.
● Use operators to calculate net savings: income - totalExpenses.
● Encapsulation: restrict direct expense editing.
● Inheritance: MonthlyBudget, AnnualBudget.
● Polymorphism: report format varies (monthly vs yearly).
 */
import java.util.*;

public class BudgetWiseApp {
	public static void main(String[] args) {

		HashMap<String, Double> categories = new HashMap<>();
		categories.put("Food", 5000.0);
		categories.put("Rent", 15000.0);
		categories.put("Travel", 3000.0);

		IAnalyzable budget = new MonthlyBudget(40000, 25000, categories);

		((MonthlyBudget) budget).addTransaction(new Transaction(4000, "Expense", "01-01", "Food"));
		((MonthlyBudget) budget).addTransaction(new Transaction(14000, "Expense", "03-01", "Rent"));
		((MonthlyBudget) budget).addTransaction(new Transaction(2000, "Expense", "10-01", "Travel"));

		budget.generateReport();
		budget.detectOverspend();
	}
}

package com.bl.day9.personalfinancetracker;

public class MonthlyBudget extends Budget implements IAnalyzable {

    public MonthlyBudget(double income, double limit, java.util.HashMap<String, Double> categories) {
        super(income, limit, categories);
    }

    @Override
    public void generateReport() {
        System.out.println("----- Monthly Budget Report -----");
        System.out.println("Income: " + income);
        System.out.println("Total Expenses: " + totalExpenses);
        System.out.println("Savings: " + getNetSavings());
    }

    @Override
    public void detectOverspend() {
        if (totalExpenses > limit) {
            System.out.println("Monthly limit exceeded!");
        } else {
            System.out.println("You are within monthly budget.");
        }
    }
}

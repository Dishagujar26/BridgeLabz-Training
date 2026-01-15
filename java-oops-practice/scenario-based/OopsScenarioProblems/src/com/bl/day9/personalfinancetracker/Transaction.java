package com.bl.day9.personalfinancetracker;

public class Transaction {
    private double amount;
    private String type;     // Income or Expense
    private String date;
    private String category;

    public Transaction(double amount, String type, String date, String category) {
        this.amount = amount;
        this.type = type;
        this.date = date;
        this.category = category;
    }

    public double getAmount() { return amount; }
    public String getType() { return type; }
    public String getDate() { return date; }
    public String getCategory() { return category; }
}

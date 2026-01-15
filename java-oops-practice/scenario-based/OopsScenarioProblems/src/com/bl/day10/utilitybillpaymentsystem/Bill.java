package com.bl.day10.utilitybillpaymentsystem;

public class Bill {
	protected String type;
	protected double amount;
	protected String dueDate;

	private boolean isPaid; 
	protected double penalty; 

	public Bill(String type, double amount, String dueDate, double penalty) {
		this.type = type;
		this.amount = amount;
		this.dueDate = dueDate;
		this.penalty = penalty;
		this.isPaid = false;
	}

	protected void markPaid() {
		isPaid = true;
	}

	public boolean getStatus() {
		return isPaid;
	}

	// Operator usage
	public double getLateAmount() {
		return amount + penalty;
	}
}

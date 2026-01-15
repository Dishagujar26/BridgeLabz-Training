package com.bl.day10.utilitybillpaymentsystem;

public class WaterBill extends Bill implements IPayable {

	public WaterBill(double amount, String dueDate) {
		super("Water", amount, dueDate, 30);
	}

	@Override
	public void pay() {
		markPaid();
		System.out.println("Water bill paid: ₹" + amount);
	}

	@Override
	public void sendReminder() {
		System.out.println("Water Bill Reminder: Water supply may stop!");
	}
}

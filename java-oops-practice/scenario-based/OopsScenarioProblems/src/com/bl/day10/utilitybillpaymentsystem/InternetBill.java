package com.bl.day10.utilitybillpaymentsystem;

public class InternetBill extends Bill implements IPayable {

	public InternetBill(double amount, String dueDate) {
		super("Internet", amount, dueDate, 100);
	}

	@Override
	public void pay() {
		markPaid();
		System.out.println("Internet bill paid: ₹" + amount);
	}

	@Override
	public void sendReminder() {
		System.out.println("Internet Bill Reminder: Service suspension warning!");
	}
}

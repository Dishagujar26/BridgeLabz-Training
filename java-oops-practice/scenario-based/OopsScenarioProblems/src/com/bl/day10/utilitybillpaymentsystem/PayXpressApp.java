package com.bl.day10.utilitybillpaymentsystem;

import java.util.*;

public class PayXpressApp {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ElectricityBill e = new ElectricityBill(1200, "10-Feb");
		InternetBill i = new InternetBill(800, "15-Feb");
		WaterBill w = new WaterBill(400, "20-Feb");

		while (true) {
			System.out.println("1. View Bills");
			System.out.println("2. Pay Electricity Bill");
			System.out.println("3. Pay Internet Bill");
			System.out.println("4. Pay Water Bill");
			System.out.println("5. Send Reminders");
			System.out.println("6. Exit");

			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				e.showBill();
				i.showBill();
				w.showBill();
				break;

			case 2:
				e.pay();
				break;

			case 3:
				i.pay();
				break;

			case 4:
				w.pay();
				break;

			case 5:
				e.sendReminder();
				i.sendReminder();
				w.sendReminder();
				break;

			case 6:
				System.exit(0);
			}
		}
	}
}

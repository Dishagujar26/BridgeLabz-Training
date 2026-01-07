package com.bl.day6.smartparkingmanagementsystem;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Vehicle Type (1.Car 2.Bike 3.Truck): ");
		int type = sc.nextInt();

		System.out.print("Vehicle Number: ");
		String number = sc.next();

		System.out.print("Parking Hours: ");
		int hours = sc.nextInt();

		Vehicle vehicle;
		String allowedType;

		switch (type) {
		case 1:
			vehicle = new Car(number);
			allowedType = "Car";
			break;
		case 2:
			vehicle = new Bike(number);
			allowedType = "Bike";
			break;
		default:
			vehicle = new Truck(number);
			allowedType = "Truck";
		}

		ParkingSlot slot = new ParkingSlot("A1", allowedType);

		if (slot.bookSlot()) {
			double bill = vehicle.calculateCharges(hours);
			ParkingRecord record = new ParkingRecord(
					"Vehicle " + number + " parked for " + hours + " hours. Bill: ₹" + bill);

			System.out.println("Slot Status: " + slot.getStatus());
			System.out.println("Total Charges: " + bill);
			record.showLog();
			slot.releaseSlot();
		} else {
			System.out.println("Slot not available!");
		}
	}
}

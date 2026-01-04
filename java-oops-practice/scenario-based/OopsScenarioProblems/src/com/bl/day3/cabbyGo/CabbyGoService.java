package com.bl.day3.cabbyGo;

import java.util.Scanner;

public class CabbyGoService {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Which ride do you want to book?\n1.Sedan\n2.Mini\n3.SUV");
		int choice = sc.nextInt();

		if (choice == 1) {
			System.out.println("Enter the Vehicle Number");
			String number = sc.next();

			Vehicle vehicle = new Sedan(number);

			System.out.println("Enter the Driver Name");
			String name = sc.next();

			System.out.println("Enter the Driver Lincese Number");
			String lcno = sc.next();

			System.out.println("Driver Rating");
			double rating = sc.nextDouble();

			Driver driver = new Driver(name, lcno, rating);

			System.out.println("What's the Distance");
			double distance = sc.nextDouble();

			IRideService rideService = new RideService();
			rideService.bookRide(vehicle, driver, distance);
			rideService.endRide();
		}
		else if (choice == 2) {
			System.out.println("Enter the Vehicle Number");
			String number = sc.next();

			Vehicle vehicle = new Mini(number);

			System.out.println("Enter the Driver Name");
			String name = sc.next();

			System.out.println("Enter the Driver Lincese Number");
			String lcno = sc.next();

			System.out.println("Driver Rating");
			double rating = sc.nextDouble();

			Driver driver = new Driver(name, lcno, rating);

			System.out.println("What's the Distance");
			double distance = sc.nextDouble();

			IRideService rideService = new RideService();
			rideService.bookRide(vehicle, driver, distance);
			rideService.endRide();
		}
		else if (choice == 3) {
			System.out.println("Enter the Vehicle Number");
			String number = sc.next();

			Vehicle vehicle = new SUV(number);

			System.out.println("Enter the Driver Name");
			String name = sc.next();

			System.out.println("Enter the Driver Lincese Number");
			String lcno = sc.next();

			System.out.println("Driver Rating");
			double rating = sc.nextDouble();

			Driver driver = new Driver(name, lcno, rating);

			System.out.println("What's the Distance");
			double distance = sc.nextDouble();

			IRideService rideService = new RideService();
			rideService.bookRide(vehicle, driver, distance);
			rideService.endRide();
		}
		else {
			System.out.println("Invalid Choice!!");
		}
		sc.close();
	}

}

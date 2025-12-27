package com.bl.constructor;

import java.util.Scanner;

public class CarRentalMain {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Customer Name:");
        String name = sc.nextLine();

        System.out.println("Enter Car Model (sedan/swift/tufan/scorpio):");
        String model = sc.nextLine();

        System.out.println("Enter Rental Days:");
        int days = sc.nextInt();

        CarRental rental = new CarRental(name, model, days);
        rental.displayDetails();

        sc.close();
	}

}

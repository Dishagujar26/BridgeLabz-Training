package com.bl.day9.smarthomedevicemanager;

/*
 *22. "HomeNest – Smart Home Device Manager"
Story: A tech company builds HomeNest, a system to control smart lights, ACs, locks, and
cameras.
Requirements:
● Device base class: deviceId, status, energyUsage.
● Subclasses: Light, Camera, Thermostat, Lock.
● Interface IControllable: turnOn(), turnOff(), reset().
● Use constructors to register devices with user.
● Encapsulation: device status cannot be modified externally.
● Operators for energy usage calculations.
● Polymorphism: reset() behavior varies by device.
● Use access modifiers to secure firmware update logs.
 */
import java.util.Scanner;

public class HomeNestApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IControllable d;
		System.out.println("Welcome");
		int totalEnergy = 0;
		while (true) {
			System.out.println(
					"Add the device you want to control!!\n1. Light\n2. Camera\n3. Thermostat\n4. Lock\n5. Exit");
			int choice = sc.nextInt();
			sc.nextLine();

			if (choice == 1) {
				System.out.println("Enter the devce id: ");
				String id = sc.nextLine();
				System.out.println("What's the energy consuption: ");
				int enerycomsp = sc.nextInt();
				totalEnergy = totalEnergy + enerycomsp;

				d = new Light("L101", enerycomsp);
				System.out.println("Device added successfully!!");
				System.out.println("\n1. Turn On Device\n2. Turn Off Device\n3. Reset Device\n4. Exit");
				choice = sc.nextInt();
				sc.nextLine();

				if (choice == 1) {
					d.turnOn();
				} else if (choice == 2) {
					d.turnOff();
				} else if (choice == 3) {
					d.reset();
				}

			} else if (choice == 2) {
				System.out.println("Enter the devce id: ");
				String id = sc.nextLine();
				System.out.println("What's the camera energy consuption: ");
				int enerycomsp = sc.nextInt();
				totalEnergy = totalEnergy + enerycomsp;

				d = new Camera(id, enerycomsp);
				System.out.println("Device added successfully!!");
				System.out.println("\n1. Turn On Device\n2. Turn Off Device\n3. Reset Device\n4. Exit");
				choice = sc.nextInt();
				sc.nextLine();

				if (choice == 1) {
					d.turnOn();
				} else if (choice == 2) {
					d.turnOff();
				} else if (choice == 3) {
					d.reset();
				}

			} else if (choice == 3) {
				System.out.println("Enter the devce id: ");
				String id = sc.nextLine();
				System.out.println("What's the energy consuption: ");
				int enerycomsp = sc.nextInt();
				totalEnergy = totalEnergy + enerycomsp;

				d = new Thermostat(id, enerycomsp);
				System.out.println("Device added successfully!!");
				System.out.println("\n1. Turn On Device\n2. Turn Off Device\n3. Reset Device\n4. Exit");
				choice = sc.nextInt();
				sc.nextLine();

				if (choice == 1) {
					d.turnOn();
				} else if (choice == 2) {
					d.turnOff();
				} else if (choice == 3) {
					d.reset();
				}

			} else if (choice == 4) {
				System.out.println("Enter the devce id: ");
				String id = sc.nextLine();
				System.out.println("What's the energy consuption: ");
				int enerycomsp = sc.nextInt();
				totalEnergy = totalEnergy + enerycomsp;

				d = new Lock(id, enerycomsp);
				System.out.println("Device added successfully!!");
				System.out.println("\n1. Turn On Device\n2. Turn Off Device\n3. Reset Device\n4. Exit");
				choice = sc.nextInt();
				sc.nextLine();

				if (choice == 1) {
					d.turnOn();
				} else if (choice == 2) {
					d.turnOff();
				} else if (choice == 3) {
					d.reset();
				}

			} else if (choice == 5) {

				System.out.println("Thank You!!");
				break;
			} else {
				System.out.println("Invalid Choicee!");
				break;
			}
		}

		System.out.println("Total Energy Used: " + totalEnergy); 
        sc.close();
	}

}

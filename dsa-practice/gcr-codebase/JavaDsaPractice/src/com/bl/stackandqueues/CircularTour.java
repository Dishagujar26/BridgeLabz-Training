package com.bl.stackandqueues;

import java.util.Scanner;

public class CircularTour {

	// Returns starting index or -1 if impossible
	public static int findStartingPump(PetrolPump[] pumps) {
		int n = pumps.length;

		int start = 0; 
		// Current patrol surplus
		int surplus = 0; 
		// Patrol deficit when failing
		int deficit = 0; 

		for (int i = 0; i < n; i++) {
			surplus += pumps[i].petrol - pumps[i].distance;

			if (surplus < 0) {
				// Cannot reach next pump, move start
				start = i + 1;
				deficit += surplus;
				surplus = 0;
			}
		}

		// Check if total petrol is enough
		return (surplus + deficit >= 0) ? start : -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of petrol pumps: ");
		int n = sc.nextInt();

		PetrolPump[] pumps = new PetrolPump[n];

		System.out.println("Enter petrol and distance for each pump:");
		for (int i = 0; i < n; i++) {
			System.out.print("Pump " + i + " petrol: ");
			int petrol = sc.nextInt();
			System.out.print("Pump " + i + " distance: ");
			int distance = sc.nextInt();
			pumps[i] = new PetrolPump(petrol, distance);
		}

		int start = findStartingPump(pumps);

		if (start != -1) {
			System.out.println("Start at pump index: " + start);
		} else {
			System.out.println("No possible starting pump");
		}

		sc.close();
	}

}

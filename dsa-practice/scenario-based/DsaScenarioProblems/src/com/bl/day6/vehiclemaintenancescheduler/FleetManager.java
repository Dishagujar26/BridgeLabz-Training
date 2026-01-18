package com.bl.day6.vehiclemaintenancescheduler;

/*
  10. FleetManager – Vehicle Maintenance Scheduler (Merge Sort)
Story: A fleet company schedules vehicle maintenance based on mileage. Each depot sends a
sorted list of vehicles. To create a master schedule, Merge Sort is used to combine these depot
lists efficiently.
Key Concepts:
● Sorted sublists from multiple sources
● Merge sort for final master list
● Efficient memory usage for large lists
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FleetManager {

	public static List<Vehicle> merge(List<Vehicle> left, List<Vehicle> right) {
		List<Vehicle> result = new ArrayList<>();
		int i = 0, j = 0;

		while (i < left.size() && j < right.size()) {
			if (left.get(i).getMileage() <= right.get(j).getMileage()) {
				result.add(left.get(i++));
			} else {
				result.add(right.get(j++));
			}
		}

		while (i < left.size())
			result.add(left.get(i++));
		while (j < right.size())
			result.add(right.get(j++));

		return result;
	}

	public static List<Vehicle> mergeSort(List<Vehicle> vehicles) {
		if (vehicles.size() <= 1)
			return vehicles;

		int mid = vehicles.size() / 2;
		List<Vehicle> left = mergeSort(vehicles.subList(0, mid));
		List<Vehicle> right = mergeSort(vehicles.subList(mid, vehicles.size()));

		return merge(left, right);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Vehicle> vehicles = new ArrayList<>();

		System.out.print("Enter number of vehicles: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("Enter vehicle ID: ");
			String id = sc.next();
			System.out.print("Enter mileage: ");
			int mileage = sc.nextInt();
			vehicles.add(new Vehicle(id, mileage));
		}

		List<Vehicle> sortedVehicles = mergeSort(vehicles);

		System.out.println("\nMaintenance Schedule (Sorted by Mileage):");
		for (Vehicle v : sortedVehicles) {
			System.out.println(v);
		}
	}
}

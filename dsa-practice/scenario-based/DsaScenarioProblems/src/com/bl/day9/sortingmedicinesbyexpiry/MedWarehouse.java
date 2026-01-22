package com.bl.day9.sortingmedicinesbyexpiry;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*10. MedWarehouse – Sorting Medicines by Expiry (Merge Sort)
Story: A pharmaceutical warehouse handles medicine records from multiple branches, each
sending a sorted list by expiry date. To ensure none are wasted, the system uses Merge Sort
to compile all expiry dates and alert if any medicine is nearing expiration.
Concepts Involved:
● Merge Sort
● Sorted sublist merging
● Critical for time-sensitive inventory*/

public class MedWarehouse {

	public static LocalDate today = LocalDate.now();

	public static int proximityThresholdDays = 15;

	// This method MERGES two already sorted lists (not full merge sort)
	public static List<Medicine> merge(List<Medicine> list1, List<Medicine> list2) {
		int i = 0, j = 0;
		List<Medicine> unionList = new ArrayList<>();

		while (i < list1.size() && j < list2.size()) {

			if (list1.get(i).getDate().isBefore(list2.get(j).getDate())) {
				unionList.add(list1.get(i));
				i++;
			} else {
				unionList.add(list2.get(j));
				j++;
			}
		}

		while (i < list1.size()) {
			unionList.add(list1.get(i));
			i++;
		}

		while (j < list2.size()) {
			unionList.add(list2.get(j));
			j++;
		}

		return unionList;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the total number of branches:");
		int n = sc.nextInt();
		sc.nextLine();

		List<Medicine> ul = new ArrayList<>();

		for (int i = 0; i < n; i++) {

			System.out.println("How many records in that branch:");
			int m = sc.nextInt();
			sc.nextLine();

			List<Medicine> list = new ArrayList<>();

			for (int j = 0; j < m; j++) {

				System.out.println("Enter the name of the medicine:");
				String name = sc.nextLine();

				System.out.println("Enter the expiry date (yyyy-mm-dd):");
				LocalDate date = LocalDate.parse(sc.nextLine());

				long daysDifference = ChronoUnit.DAYS.between(today, date);

				boolean nearExpiry;
				if (daysDifference >= 0 && daysDifference <= proximityThresholdDays) {
					nearExpiry = true;
				} else {
					nearExpiry = false;
				}

				Medicine med = new Medicine(nearExpiry, name, date);
				list.add(med);
			}

			if (i == 0) {
				ul = list;
			} else {
				ul = merge(ul, list);
			}
		}

		System.out.println("Medicines sorted by expiry date:");
		System.out.println(ul);

		sc.close();
	}
}

package com.bl.hashmapsandfunctions;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PairWithSum {

	// Returns true if there exists a pair with given sum
	public static boolean hasPairWithSum(int[] arr, int target) {
		Set<Integer> set = new HashSet<>();

		for (int num : arr) {
			int complement = target - num;
			if (set.contains(complement)) {
				System.out.println("Pair found: (" + complement + ", " + num + ")");
				return true;
			}
			set.add(num); // Store current number for future pairs
		}

		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter array elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print("Enter target sum: ");
		int target = sc.nextInt();

		if (!hasPairWithSum(arr, target)) {
			System.out.println("No pair with the given sum exists.");
		}

		sc.close();
	}

}

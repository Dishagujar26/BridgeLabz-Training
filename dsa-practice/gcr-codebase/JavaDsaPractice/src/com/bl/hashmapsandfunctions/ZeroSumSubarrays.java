package com.bl.hashmapsandfunctions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ZeroSumSubarrays {

	public static void findZeroSumSubarrays(int[] arr) {
		// Map to store cumulative sum and list of indices where it occurs
		Map<Integer, List<Integer>> map = new HashMap<>();
		int sum = 0;

		// Initialize with sum 0 at index -1 (for subarrays starting at index 0)
		map.put(0, new ArrayList<>(Arrays.asList(-1)));

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];

			if (map.containsKey(sum)) {
				// Found previous occurrence(s) of the same cumulative sum
				List<Integer> indices = map.get(sum);
				for (int startIndex : indices) {
					System.out.println("Subarray found from index " + (startIndex + 1) + " to " + i);
				}
			}

			// Add current index to the list of indices for this sum
			map.computeIfAbsent(sum, k -> new ArrayList<>()).add(i);
		}
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

		System.out.println("Zero-sum subarrays:");
		findZeroSumSubarrays(arr);

		sc.close();
	}

}

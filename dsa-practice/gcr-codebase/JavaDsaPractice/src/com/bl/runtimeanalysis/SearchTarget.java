package com.bl.runtimeanalysis;

import java.util.Arrays;

public class SearchTarget {
	// Linear Search O(N)
	static int linearSearch(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target)
				return i;
		}
		return -1;
	}

	// O(log N) Binary search
	static int binarySearch(int[] arr, int target) {
	    Arrays.sort(arr); // O(n log n) - array must be sorted 
	    int left = 0, right = arr.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (arr[mid] == target)
				return mid;
			else if (arr[mid] < target)
				left = mid + 1;
			else
				right = mid - 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		int N = 1_000_000;
		int target = N - 1;

		int[] data = new int[N];
		for (int i = 0; i < N; i++) {
			data[i] = i;
		}

		long start = System.nanoTime();
		linearSearch(data, target);
		long linearTime = System.nanoTime() - start;

		start = System.nanoTime();
		binarySearch(data, target);
		long binaryTime = System.nanoTime() - start;

		System.out.println("Linear Search Time (ms): " + linearTime / 1_000_000.0);
		System.out.println("Binary Search Time (ms): " + binaryTime / 1_000_000.0);
	}
}

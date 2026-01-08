package com.bl.binarysearch;

import java.util.Scanner;

public class RotationPoint {

	public static int findRotationPoint(int[] arr) {
		int left = 0, right = arr.length - 1;

		while (left < right) {
			int mid = left + (right - left) / 2;

			if (arr[mid] > arr[right]) {
				// Minimum is in right half
				left = mid + 1;
			} else {
				// Minimum is in left half including mid
				right = mid;
			}
		}

		// left == right → smallest element
		return left;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of the rotated sorted array: ");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter " + n + " elements of the rotated sorted array:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int rotationIndex = findRotationPoint(arr);

		System.out.println(
				"Rotation point (smallest element) is at index " + rotationIndex + " with value " + arr[rotationIndex]);

		sc.close();
	}

}

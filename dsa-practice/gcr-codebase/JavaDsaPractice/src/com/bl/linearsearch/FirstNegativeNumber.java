package com.bl.linearsearch;

import java.util.Scanner;

public class FirstNegativeNumber {

	public static int findFirstNegative(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter " + n + " integers:");

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int index = findFirstNegative(arr);

		if (index != -1) {
			System.out.println("First negative number: " + arr[index] + " at index " + index);
		} else {
			System.out.println("No negative number found in the array.");
		}

		sc.close();
	}

}

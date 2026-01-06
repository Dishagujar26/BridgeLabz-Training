package com.bl.sorting;

import java.util.Arrays;
import java.util.Scanner;

//best O(n) average, worst - O(n2) or space O(1)

public class InsertionSort {

	public static int[] sort(int[] employeeID) {

		for (int i = 0; i < employeeID.length - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (employeeID[j] < employeeID[j - 1]) {
					swap(employeeID, j, j - 1);

				} else {
					break;
				}
			}
		}
		return employeeID;
	}

	public static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int[] employeeID = new int[n];
		
		System.out.println("Enter the numbers");
		for (int i = 0; i < n; i++) {
			employeeID[i] = sc.nextInt();
		}
		int[] result = sort(employeeID);
		System.out.println(Arrays.toString(result));
	}

}

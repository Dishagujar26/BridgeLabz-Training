package com.bl.sorting;

import java.util.Arrays;
import java.util.Scanner;

//O(n+k) best/average/worst space O(k)

public class CountingSort {
	public static void sort(int[] arr) {

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		// frequency array
		int[] count = new int[max + 1];
		for (int i = 0; i < arr.length; i++) {
			count[arr[i]]++;
		}

		// convert frequency array into prefix sum array - start with 1
		for (int i = 1; i < count.length; i++) {
			count[i] += count[i - 1];
		}

		// build the output array - traverse backwards
		int output[] = new int[arr.length];
		for (int i = arr.length - 1; i >= 0; i--) {
			int value = arr[i];
			count[value]--;
			int position = count[value];
			output[position] = value;
		}

		// copy the output array into original array
		for (int i = 0; i < arr.length; i++) {
			arr[i] = output[i];
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many students are there: ");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter the students age one by one: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}

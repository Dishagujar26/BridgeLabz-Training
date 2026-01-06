package com.bl.sorting;

import java.util.Arrays;
import java.util.Scanner;

// average/best case O(n log n) worst O(n)

public class QuickSort {

	public static void quickSort(double[] productPrice, int low, int high) {
		if (low >= high) {
			return;
		}
		int pivotIndex = partition(productPrice, low, high);
		quickSort(productPrice, low, pivotIndex - 1);
		quickSort(productPrice, pivotIndex + 1, high);
	}

	public static int partition(double[] productPrice, int low, int high) {
		double pivot = productPrice[high];
		int i = low;
		int j = high;
		while (i < j) {
			if (productPrice[i] <= pivot && i <= high - 1) {
				i++;
			}
			if (productPrice[j] >= pivot && j >= low + 1) {
				j--;
			}
			if (i < j) {
				swap(productPrice, i, j);
			}
		}
		swap(productPrice, high, j);// swap with low if pivot is assumed arr[low]
		return j;
	}

	public static void swap(double[] productPrice, int low, int high) {
		double temp = productPrice[low];
		productPrice[low] = productPrice[high];
		productPrice[high] = temp;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");

		int n = sc.nextInt();
		double[] productPrice = new double[n];

		System.out.println("Enter the product prices");
		for (int i = 0; i < n; i++) {
			productPrice[i] = sc.nextInt();
		}

		quickSort(productPrice, 0, productPrice.length - 1);
		System.out.println(Arrays.toString(productPrice));
	}

}

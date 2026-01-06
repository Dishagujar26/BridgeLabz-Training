package com.bl.sorting;

import java.util.Arrays;
import java.util.Scanner;

//best best/average/worst O(n log n) space O(n)(for extra array)

public class MergeSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		double[] bookPrice = new double[n];

		System.out.println("Enter the book prices");
		for (int i = 0; i < n; i++) {
			bookPrice[i] = sc.nextDouble();
		}

		sort(bookPrice, 0, bookPrice.length - 1);
		System.out.println(Arrays.toString(bookPrice));
	}

	public static void sort(double[] bookPrice, int s, int e) {
		if (s >= e) {
			return;
		}
		// find middle 
		int mid = s + (e - s) / 2;

		sort(bookPrice, s, mid);
		sort(bookPrice, mid + 1, e);
		merge(bookPrice, s, mid, e);
	}

	public static void merge(double[] bookPrice, int s, int mid, int e) {
		double[] temp = new double[e - s + 1];
		int i = s;
		int j = mid + 1;
		int k = 0;

		while (i <= mid && j <= e) {
			if (bookPrice[i] < bookPrice[j]) {
				temp[k] = bookPrice[i];
				i++;
			} else {
				temp[k] = bookPrice[j];
				j++;
			}
			k++;
		}
		while (i <= mid) {
			temp[k++] = bookPrice[i++];
		}
		while (j <= e) {
			temp[k++] = bookPrice[j++];
		}

		// copy back to the original array
		for (k = 0, i = s; k < temp.length; k++, i++) {
			bookPrice[i] = temp[k];
		}
	}
}

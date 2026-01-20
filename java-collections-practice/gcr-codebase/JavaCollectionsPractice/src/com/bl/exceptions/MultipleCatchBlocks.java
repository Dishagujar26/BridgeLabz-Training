package com.bl.exceptions;

import java.util.Scanner;

public class MultipleCatchBlocks {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the array size: ");
		int n = sc.nextInt();
		String[] arr = new String[n];

		// Fill only some values to create nulls
		for (int i = 0; i < n - 2; i++) {
			arr[i] = sc.nextLine();
		}

		try {
			System.out.println("Enter the index number: ");
			int idx = sc.nextInt();

			// This line can cause BOTH exceptions (depending on input)
			System.out.println(arr[idx].length());

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index is out of bounds!!");

		} catch (NullPointerException e) {
			System.out.println("Array value is null!!");
		}

		sc.close();
	}
}

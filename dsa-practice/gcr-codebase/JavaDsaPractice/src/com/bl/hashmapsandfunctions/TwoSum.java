package com.bl.hashmapsandfunctions;

import java.util.Scanner;

public class TwoSum {
	
	public static int[] twoSum(int[] nums, int target) {

		int counti = 0, countj = 0;

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					counti = i;
					countj = j;
				}
			}
		}
		int[] ans = { counti, countj };
		return ans;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();

		int[] nums = new int[n];
		System.out.println("Enter array elements:");
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}

		System.out.print("Enter target sum: ");
		int target = sc.nextInt();

		int[] result = twoSum(nums, target);

		if (result[0] != -1) {
			System.out.println("Indices: " + result[0] + ", " + result[1]);
		} else {
			System.out.println("No two elements add up to the target.");
		}

		sc.close();
	}

}

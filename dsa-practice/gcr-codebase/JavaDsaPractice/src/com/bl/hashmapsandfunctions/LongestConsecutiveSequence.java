package com.bl.hashmapsandfunctions;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestConsecutiveSequence {

	public static int longestConsecutive(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;

		Set<Integer> set = new HashSet<>();
		for (int num : nums) {
			set.add(num);
		}

		int longest = 0;

		for (int num : set) {
			// Only start counting at the beginning of a sequence
			if (!set.contains(num - 1)) {
				int currentNum = num;
				int currentStreak = 1;

				while (set.contains(currentNum + 1)) {
					currentNum++;
					currentStreak++;
				}

				longest = Math.max(longest, currentStreak);
			}
		}

		return longest;
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

		int length = longestConsecutive(nums);
		System.out.println("Length of longest consecutive sequence: " + length);

		sc.close();
	}

}

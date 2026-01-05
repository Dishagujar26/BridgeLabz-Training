package com.bl.stackandqueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class SlidingWindowMaximum {

	public static int[] maxSlidingWindow(int[] nums, int k) {
		if (nums == null || k <= 0)
			return new int[0];

		int n = nums.length;
		int[] result = new int[n - k + 1]; 
		int ri = 0; // Result index

		// Store indices of elements
		Deque<Integer> deque = new ArrayDeque<>(); 

		for (int i = 0; i < n; i++) {

			// remove indices that are out of the current window
			while (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
				deque.pollFirst();
			}

			// remove indices whose values are less than current element
			while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
				deque.pollLast();
			}

			// Add current element's index
			deque.offerLast(i);

			// Record max in result array (starting from window of size k)
			if (i >= k - 1) {
				result[ri++] = nums[deque.peekFirst()];
			}
		}

		return result;
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

		System.out.print("Enter window size k: ");
		int k = sc.nextInt();

		int[] maxWindow = maxSlidingWindow(nums, k);

		System.out.println("Sliding window maximum:");
		for (int val : maxWindow) {
			System.out.print(val + " ");
		}

		sc.close();
	}

}

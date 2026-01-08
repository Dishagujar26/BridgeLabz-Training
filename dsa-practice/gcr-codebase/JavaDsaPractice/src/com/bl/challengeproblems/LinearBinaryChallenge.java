package com.bl.challengeproblems;

import java.util.Arrays;
import java.util.Scanner;

public class LinearBinaryChallenge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers (can be unsorted):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int missing = firstMissingPositive(arr);
        System.out.println("First missing positive integer: " + missing);

        Arrays.sort(arr); // Binary search requires sorted array
        System.out.print("Enter target number to search: ");
        int target = sc.nextInt();

        int index = binarySearch(arr, target);
        if (index != -1) {
            System.out.println("Target " + target + " found at index (sorted array) " + index);
        } else {
            System.out.println("Target " + target + " not found in the array.");
        }

        sc.close();
    }

    // --- Linear Search Method: First Missing Positive ---
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // Step 1: Place each number in its correct position if possible
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i]-1] != nums[i]) {
                // Swap nums[i] with nums[nums[i]-1]
                int temp = nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
                nums[i] = temp;
            }
        }

        // Step 2: Find first missing positive
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        return n + 1; // all 1..n are present
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }

        return -1; // not found
    }
}

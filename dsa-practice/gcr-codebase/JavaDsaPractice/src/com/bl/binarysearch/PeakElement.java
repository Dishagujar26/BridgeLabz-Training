package com.bl.binarysearch;

public class PeakElement {

	public static int findPeak(int[] arr) {
		int left = 0, right = arr.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			boolean leftSmaller = (mid == 0) || (arr[mid] > arr[mid - 1]);
			boolean rightSmaller = (mid == arr.length - 1) || (arr[mid] > arr[mid + 1]);

			if (leftSmaller && rightSmaller) {
				return mid; // peak element
			} else if (mid > 0 && arr[mid] < arr[mid - 1]) {
				right = mid - 1; // search left half
			} else {
				left = mid + 1; // search right half
			}
		}
		return -1; // not found (theoretically impossible for valid input)
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 20, 4, 1, 0 };
		int peakIndex = findPeak(arr);
		System.out.println("Peak element: " + arr[peakIndex] + " at index " + peakIndex);
	}

}

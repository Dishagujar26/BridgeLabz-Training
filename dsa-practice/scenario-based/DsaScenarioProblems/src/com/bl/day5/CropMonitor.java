package com.bl.day5;

/*
  8. CropMonitor – Sensor Data Ordering (Quick Sort)
Story: An agri-tech firm uses drone sensors that record soil temperatures at random intervals.
The large data needs to be sorted quickly by timestamp before visualization. Quick Sort is
chosen due to its fast average performance.
Key Concepts:
● Unordered sensor data
● High-speed sorting
● Quick partitioning based on timestamps
 */
import java.util.Scanner;

class CropMonitor {
	private int[] timestamps;

	public CropMonitor(int size) {
		timestamps = new int[size];
	}

	public void inputTimestamps(Scanner sc) {
		for (int i = 0; i < timestamps.length; i++) {
			System.out.print("Enter timestamp " + (i + 1) + ": ");
			timestamps[i] = sc.nextInt();
		}
	}

	private void quickSort(int low, int high) {
		if (low < high) {
			int pi = partition(low, high);
			quickSort(low, pi - 1);
			quickSort(pi + 1, high);
		}
	}

	private int partition(int low, int high) {
		int pivot = timestamps[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (timestamps[j] <= pivot) {
				i++;
				int temp = timestamps[i];
				timestamps[i] = timestamps[j];
				timestamps[j] = temp;
			}
		}
		int temp = timestamps[i + 1];
		timestamps[i + 1] = timestamps[high];
		timestamps[high] = temp;
		return i + 1;
	}

	public void sortTimestamps() {
		quickSort(0, timestamps.length - 1);
	}

	public void display() {
		System.out.println("Sorted timestamps:");
		for (int t : timestamps)
			System.out.print(t + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of sensor readings: ");
		CropMonitor cm = new CropMonitor(sc.nextInt());
		cm.inputTimestamps(sc);
		cm.sortTimestamps();
		cm.display();
	}
}

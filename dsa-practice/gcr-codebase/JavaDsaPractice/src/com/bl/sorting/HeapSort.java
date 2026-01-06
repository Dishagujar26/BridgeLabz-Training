package com.bl.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class HeapSort {
    public static void heapSort(int[] salary) {
        int n = salary.length;

        // Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(salary, n, i);
        }

        // Extract elements from heap one by one
        for (int i = n - 1; i > 0; i--) {
            // move current root to end
            int temp = salary[0];
            salary[0] = salary[i];
            salary[i] = temp;

            // Re-heapify reduced heap
            heapify(salary, i, 0);
        }
    }

    // Heapify a subtree rooted at index i
    public static void heapify(int[] salary, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && salary[left] > salary[largest]) {
            largest = left;
        }

        if (right < n && salary[right] > salary[largest]) {
            largest = right;
        }

        if (largest != i) {
            int swap = salary[i];
            salary[i] = salary[largest];
            salary[largest] = swap;

            // Recursively heapify affected subtree
            heapify(salary, n, largest);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of job applicants:");
        int n = sc.nextInt();

        int[] salary = new int[n];

        System.out.println("Enter expected salary demands:");
        for (int i = 0; i < n; i++) {
            salary[i] = sc.nextInt();
        }

        heapSort(salary);

        System.out.println("Sorted Salary Demands (Ascending):");
        System.out.println(Arrays.toString(salary));
    }
}

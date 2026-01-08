package com.bl.runtimeanalysis;

import java.util.Random;

public class SortData {
    // Bubble Sort O(N^2)
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Merge Sort O(N log N)
    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) L[i] = arr[l + i];
        for (int j = 0; j < n2; j++) R[j] = arr[m + 1 + j];

        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2) {
            arr[k++] = (L[i] <= R[j]) ? L[i++] : R[j++];
        }

        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

    // Quick Sort O(n log n)
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int N = 10_000;
        int[] data = new Random().ints(N, 0, N).toArray();

        int[] arr1 = data.clone();
        int[] arr2 = data.clone();
        int[] arr3 = data.clone();

        long start;

        start = System.nanoTime();
        bubbleSort(arr1);
        System.out.println("Bubble Sort Time (ms): " + (System.nanoTime() - start) / 1_000_000.0);

        start = System.nanoTime();
        mergeSort(arr2, 0, arr2.length - 1);
        System.out.println("Merge Sort Time (ms): " + (System.nanoTime() - start) / 1_000_000.0);

        start = System.nanoTime();
        quickSort(arr3, 0, arr3.length - 1);
        System.out.println("Quick Sort Time (ms): " + (System.nanoTime() - start) / 1_000_000.0);
    }
}

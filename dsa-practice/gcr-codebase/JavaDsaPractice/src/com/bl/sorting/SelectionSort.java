package com.bl.sorting;
import java.util.Arrays;
import java.util.Scanner;

//best/average/worst O(n2) space O(1)

public class SelectionSort {

    // Selection Sort (placing max at the end)
    public static int[] sort(int[] score) {
        for (int i = 0; i < score.length; i++) {
            int last = score.length - i - 1;
            int maxIndex = max(score, 0, last);
            swap(score, maxIndex, last);
        }
        return score;
    }

    // Find index of maximum element in given range
    public static int max(int[] score, int start, int end) {
        int maxIndex = start;
        for (int i = start; i <= end; i++) {
            if (score[i] > score[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    // Swap elements
    public static void swap(int[] score, int start, int end) {
        int temp = score[start];
        score[start] = score[end];
        score[end] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        int[] score = new int[n];

        System.out.println("Enter the student's score");
        for (int i = 0; i < n; i++) {
            score[i] = sc.nextInt();
        }

        int[] result = sort(score);

        System.out.println("Sorted Scores: " + Arrays.toString(result));
        System.out.println("Lowest Score: " + result[0]);
    }
}


package com.bl.runtimeanalysis;

import java.util.HashSet;
import java.util.TreeSet;

public class CompareDataStruture {

	public static void main(String[] args) {

		int N = 1_000_000;
		int target = N - 1;

		int[] array = new int[N];
		HashSet<Integer> hashSet = new HashSet<>();
		TreeSet<Integer> treeSet = new TreeSet<>();

		for (int i = 0; i < N; i++) {
			array[i] = i;
			hashSet.add(i);
			treeSet.add(i);
		}

		// Array Search
		long start = System.nanoTime();
		boolean found = false;
		for (int x : array) {
			if (x == target) {
				found = true;
				break;
			}
		}
		System.out.println("Array Search (ms): " + (System.nanoTime() - start) / 1_000_000.0);

		// HashSet Search
		start = System.nanoTime();
		hashSet.contains(target);
		System.out.println("HashSet Search (ms): " + (System.nanoTime() - start) / 1_000_000.0);

		// TreeSet Search
		start = System.nanoTime();
		treeSet.contains(target);
		System.out.println("TreeSet Search (ms): " + (System.nanoTime() - start) / 1_000_000.0);
	}
}

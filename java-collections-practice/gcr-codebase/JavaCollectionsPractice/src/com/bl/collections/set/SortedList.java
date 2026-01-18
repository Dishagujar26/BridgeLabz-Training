package com.bl.collections.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class SortedList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Set<Integer> set1 = new HashSet<>();

		System.out.println("Enter size of set1");
		int n1 = sc.nextInt();

		System.out.println("Enter elements of set1");
		for (int i = 0; i < n1; i++) {
			set1.add(sc.nextInt());
		}

		System.out.println("Set " + set1);
		List<Integer> al = new ArrayList<>();
		for (Integer e : set1) {
			al.add(e);
		}
		Collections.sort(al);
		System.out.println("Sorted List "+ al);
	}

}

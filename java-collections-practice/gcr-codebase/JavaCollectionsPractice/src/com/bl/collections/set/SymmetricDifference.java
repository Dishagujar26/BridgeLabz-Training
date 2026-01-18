package com.bl.collections.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SymmetricDifference {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();

		System.out.println("Enter size of set1");
		int n1 = sc.nextInt();

		System.out.println("Enter elements of set1");
		for (int i = 0; i < n1; i++) {
			set1.add(sc.nextInt());
		}

		System.out.println("Enter size of set2");
		int n2 = sc.nextInt();

		System.out.println("Enter elements of set2");
		for (int i = 0; i < n2; i++) {
			set2.add(sc.nextInt());
		}
		// interaction
		Set<Integer> difference = new HashSet<>();
		for (Integer e : set2) {
			if (!set1.contains(e)) {
				difference.add(e);
			}
		}
		for (Integer e : set1) {
			if (!set2.contains(e)) {
				difference.add(e);
			}
		}
		System.out.println("Interaction " + difference);
		sc.close();
	}
}

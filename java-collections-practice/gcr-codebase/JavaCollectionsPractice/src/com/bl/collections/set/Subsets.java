package com.bl.collections.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Subsets {
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

		// check if set 1 is subset of set 2
		boolean isSubset = true;
		for (Integer e : set1) {
			if (!set2.contains(e)) {
				isSubset = false;
				break;
			}
		}
		System.out.println(isSubset == true ? "Set 1 is a subset of set 2" : "Set 1 isn't a subset of set 2");

		// check if set 2 is subset of set 1
		boolean isSubset2 = true;
		for (Integer e : set2) {
			if (!set1.contains(e)) {
				isSubset = false;
				break;
			}
		}
		System.out.println(isSubset2 == true ? "Set 2 is a subset of set 1" : "Set 2 isn't a subset of set 1");
	}

}

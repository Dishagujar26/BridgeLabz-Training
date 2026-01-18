package com.bl.collections.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class EqualSet {
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));

		Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 3, 2, 1));

		boolean isEqual = true;
		if (set1.size() != set2.size()) {
			isEqual = false;
		} else {
			for (Integer e : set2) {
				if (!set1.contains(e)) {
					isEqual = false;
					break;
				}
			}
		}
		System.out.println(isEqual == true ? "Sets are equal" : "Sets not equal");

	}
}

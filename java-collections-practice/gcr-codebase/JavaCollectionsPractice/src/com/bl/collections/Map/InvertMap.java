package com.bl.collections.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class InvertMap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Character, Integer> map = new HashMap<>();
		HashMap<Integer, List<Character>> invrtedMap = new HashMap<>();

		// first create normal map
		System.out.println("Enter the size of the hash map: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Entr character: ");
			char c = sc.next().charAt(0);
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		for (Map.Entry<Character, Integer> e : map.entrySet()) {
			// key - integer (frequency) and value list of character
			int freq = e.getValue();
			char ch = e.getKey();

			if (!invrtedMap.containsKey(freq)) {
				// create list first
				List<Character> list = new ArrayList<>();
				list.add(ch);
				invrtedMap.put(freq, list);
			} else {
				// key exists → add to existing list
				invrtedMap.get(freq).add(ch);
			}
		}
	}

}

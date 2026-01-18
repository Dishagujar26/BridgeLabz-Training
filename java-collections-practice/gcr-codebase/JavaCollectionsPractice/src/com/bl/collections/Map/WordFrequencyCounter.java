package com.bl.collections.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequencyCounter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter text: ");
		String input = sc.nextLine();

		// convert to lowercase and remove punctuation
		input = input.toLowerCase().replaceAll("[^a-z ]", "");

		String[] words = input.split("\\s+");

		Map<String, Integer> freqMap = new HashMap<>();

		for (String word : words) {
			if (!word.isEmpty()) {
				freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
			}
		}

		System.out.println(freqMap);
		sc.close();
	}
}

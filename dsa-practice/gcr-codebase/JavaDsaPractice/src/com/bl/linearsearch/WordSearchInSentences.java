package com.bl.linearsearch;

import java.util.Scanner;

public class WordSearchInSentences {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of sentences: ");
		int n = sc.nextInt();
		sc.nextLine(); // consume leftover newline

		String[] sentences = new String[n];
		System.out.println("Enter the sentences:");

		for (int i = 0; i < n; i++) {
			sentences[i] = sc.nextLine();
		}

		System.out.print("Enter the word to search: ");
		String word = sc.nextLine();

		String result = searchWord(sentences, word);

		System.out.println("Result: " + result);

		sc.close();
	}

	public static String searchWord(String[] sentences, String word) {
		for (String sentence : sentences) {
			if (sentence.contains(word)) {
				return sentence; // return first sentence containing the word
			}
		}
		return "Not Found"; // word not present in any sentence
	}
}

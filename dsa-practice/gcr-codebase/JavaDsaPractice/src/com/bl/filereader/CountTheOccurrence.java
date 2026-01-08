package com.bl.filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountTheOccurrence {

	public static void main(String[] args) {

		String filePath = "C:/Users/acer/OneDrive/Desktop/Sample.txt";
		String targetWord = "hello";
		int count = 0;

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

			String line;
			while ((line = br.readLine()) != null) {

				String[] words = line.split("\\s+"); // split by spaces

				for (String word : words) {
					if (word.equalsIgnoreCase(targetWord)) {
						count++;
					}
				}
			}

			System.out.println("Occurrences of '" + targetWord + "': " + count);

		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}
	}
}

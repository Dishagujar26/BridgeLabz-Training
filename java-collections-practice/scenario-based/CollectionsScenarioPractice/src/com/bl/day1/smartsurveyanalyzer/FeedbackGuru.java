package com.bl.day1.smartsurveyanalyzer;

import java.io.*;
import java.util.*;
import java.util.regex.*;

/*
 3. FeedbackGuru – Smart Survey Analyzer
Story: A retail chain collects feedback in plain .txt files where each line contains customer
feedback like:
"Service was amazing. Would rate 9/10. Will visit again."
They want to create a Java tool called FeedbackGuru that:
● Reads all .txt feedback files (IO)
● Uses regex to extract ratings (e.g., 7/10, 9/10)
● Groups feedback into categories (Positive, Neutral, Negative) using Map<String,
List<String>>`
● Uses Generics to allow flexible feedback types (e.g., Product, Service)
● Handles missing/invalid lines gracefully using exception handling
*/
public class FeedbackGuru {

	private static final Pattern RATING_PATTERN = Pattern.compile("(\\d{1,2})/10");

	public static void main(String[] args) {

		File folder = new File("D:\\scenariospecifidir\\feedbacks"); // folder containing txt files
		Map<String, List<Feedback<String>>> categorized = new HashMap<>();
		categorized.put("Positive", new ArrayList<>());
		categorized.put("Neutral", new ArrayList<>());
		categorized.put("Negative", new ArrayList<>());

		if (folder.listFiles() == null) {
			System.out.println("No feedback files found.");
			return;
		}

		for (File file : folder.listFiles()) {
			if (!file.getName().endsWith(".txt"))
				continue;

			try (BufferedReader br = new BufferedReader(new FileReader(file))) {
				String line;
				while ((line = br.readLine()) != null) {
					try {
						Feedback<String> feedback = parseFeedback("Service", line); // type = Service
						String category = categorize(feedback.getRating());
						categorized.get(category).add(feedback);
					} catch (Exception e) {
						System.out.println("Skipping invalid line: " + line);
					}
				}
			} catch (IOException e) {
				System.out.println("Failed to read file: " + file.getName());
			}
		}

		// Print categorized feedback
		categorized.forEach((category, list) -> {
			System.out.println("\n" + category + " Feedback:");
			list.forEach(System.out::println);
		});
	}

	private static Feedback<String> parseFeedback(String type, String text) throws Exception {
		Matcher m = RATING_PATTERN.matcher(text);
		if (m.find()) {
			int rating = Integer.parseInt(m.group(1));
			return new Feedback<>(type, text, rating);
		}
		throw new Exception("Rating not found");
	}

	private static String categorize(int rating) {
		if (rating >= 8)
			return "Positive";
		if (rating >= 5)
			return "Neutral";
		return "Negative";
	}
}

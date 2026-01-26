package com.bl.day1.smartresumefilteringsystem;
/*
  1. ResumeAnalyzer – Smart Resume Filtering System
Story: At HireRight Technologies, HRs receive hundreds of resumes daily. An automated
system called ResumeAnalyzer is being developed to process .txt and .pdf resumes stored
in a folder.
The goal is to read each resume (using I/O Streams), extract contact details (email, phone)
using Regex, and index them into a Map<String, ResumeData>, where the key is the
candidate's email.
The system should support:
● Reading resumes from a folder
● Extracting keywords (Java, Python, Spring) using regex
● Storing candidates in a list sorted by keyword match count
● Skipping resumes with invalid formats using exception handling
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ResumeAnalyzerMain {

	public static void main(String[] args) {

		File folder = new File("D:\\scenariospecifidir\\resumes"); // folder path
		Map<String, ResumeData> resumeMap = new HashMap<>();
		List<ResumeData> resumeList = new ArrayList<>();

		for (File file : folder.listFiles()) {
			try {
				if (!file.getName().endsWith(".txt")) {
					throw new IllegalArgumentException("Unsupported file format");
				}

				String content = readFile(file);

				String email = extract(content, ResumeAnalyzer.EMAIL_PATTERN);
				String phone = extract(content, ResumeAnalyzer.PHONE_PATTERN);
				int keywordCount = countKeywords(content);

				ResumeData data = new ResumeData(email, phone, keywordCount);
				resumeMap.put(email, data);
				resumeList.add(data);

			} catch (Exception e) {
				System.out.println("Skipping file: " + file.getName());
			}
		}

		// Sort by keyword count (descending)
		resumeList.sort((a, b) -> b.keywordCount - a.keywordCount);

		System.out.println("\nSorted Candidates:");
		resumeList.forEach(System.out::println);
	}

	private static String readFile(File file) throws IOException {
		StringBuilder sb = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line;
			while ((line = br.readLine()) != null) {
				sb.append(line).append(" ");
			}
		}
		return sb.toString();
	}

	private static String extract(String text, Pattern pattern) throws Exception {
		Matcher matcher = pattern.matcher(text);
		if (matcher.find())
			return matcher.group();
		throw new Exception("Required field missing");
	}

	private static int countKeywords(String text) {
		Matcher matcher = ResumeAnalyzer.KEYWORDS_PATTERN.matcher(text);
		int count = 0;
		while (matcher.find())
			count++;
		return count;
	}

}

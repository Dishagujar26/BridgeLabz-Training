package com.bl.day2.bulkmarksprocessing;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ExamResultUploader<T> {

	private static final Pattern CSV_PATTERN = Pattern.compile("\\d+,\\w+,[A-Za-z]+,\\d+");

	private Map<String, List<Integer>> subjectMarks = new HashMap<>();
	private Exam<T> exam;

	public ExamResultUploader(Exam<T> exam) {
		this.exam = exam;
	}

	public void upload(File file) throws IOException, InvalidFormatException, MissingMarksException {
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {

			String line;
			br.readLine(); // skip header

			while ((line = br.readLine()) != null) {
				processLine(line);
			}
		}
	}

	private void processLine(String line) throws InvalidFormatException, MissingMarksException {

		if (!CSV_PATTERN.matcher(line).matches()) {
			throw new InvalidFormatException("Invalid CSV format: " + line);
		}

		String[] parts = line.split(",");

		String subject = parts[2];
		String marksStr = parts[3];

		if (marksStr.isEmpty()) {
			throw new MissingMarksException("Missing marks for subject: " + subject);
		}

		int marks = Integer.parseInt(marksStr);

		subjectMarks.computeIfAbsent(subject, k -> new ArrayList<>()).add(marks);
	}

	// Top scorer per subject
	public Map<String, Integer> getTopScorers() {
		Map<String, Integer> result = new HashMap<>();

		for (Map.Entry<String, List<Integer>> entry : subjectMarks.entrySet()) {
			PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

			pq.addAll(entry.getValue());
			result.put(entry.getKey(), pq.peek());
		}
		return result;
	}

	public Map<String, List<Integer>> getSubjectMarks() {
		return subjectMarks;
	}
}

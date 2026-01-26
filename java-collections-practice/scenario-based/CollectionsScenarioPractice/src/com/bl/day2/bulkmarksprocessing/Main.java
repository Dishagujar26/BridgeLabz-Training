package com.bl.day2.bulkmarksprocessing;

import java.io.File;

/*
  9. ExamResultUploader – Bulk Marks Processing
Story: A school system uploads student marks as .csv files:
RollNo,Name,Subject,Marks
101,Ravi,Math,95
102,Anita,Science,88
The ExamResultUploader tool must:
● Read the file using FileReader and BufferedReader
● Validate each line with Regex (no missing fields, correct marks format)
● Use Map<String, List<Integer>> to store subject-wise marks
● Calculate top scorer per subject using PriorityQueue
● Use Generics to allow support for mid-term, finals, or internal exams
● Throw custom exceptions for invalid formats or missing marks
 */
public class Main {
	public static void main(String[] args) throws Exception {

		Exam<String> exam = new Exam<>("Final");
		ExamResultUploader<String> uploader = new ExamResultUploader<>(exam);

		uploader.upload(new File("D:\\scenariospecifidir\\marks.csv"));

		System.out.println("Subject-wise Marks:");
		uploader.getSubjectMarks().forEach((s, m) -> System.out.println(s + " -> " + m));

		System.out.println("\nTop Scorers:");
		uploader.getTopScorers().forEach((s, m) -> System.out.println(s + " : " + m));
	}
}

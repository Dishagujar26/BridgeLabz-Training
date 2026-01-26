package com.bl.day1.digitalanswersheetvalidator;
import java.io.*;
import java.util.*;
import java.util.regex.*;
/*
5. ExamScanner – Digital Answer Sheet Validator
Story: In a school, multiple-choice answer sheets are scanned and saved as .csv files. Each
line looks like:
John Doe,A,B,C,D,A,B,C
ExamScanner should:
● Read each line and parse student answers using BufferedReader
● Compare answers with a provided answer key
● Use Generics to work with different subject types (MathAnswerSheet,
ScienceAnswerSheet)
● Use Map<StudentName, Score>, and sort results using a PriorityQueue
● Detect formatting issues using Regex (e.g., extra/missing commas, invalid options) 
*/
public class ExamScanner {

    // Regex to validate MCQ answers (A-D)
    private static final Pattern LINE_PATTERN = Pattern.compile("^([a-zA-Z ]+),(A|B|C|D)(,(A|B|C|D))*$");

    public static void main(String[] args) {

        String answerKeyLine = "A,B,C,D,A,B,C";  // reference answer key
        List<Character> answerKey = parseAnswerKey(answerKeyLine);

        File folder = new File("D:\\scenariospecifidir\\csvfiles");  // folder containing CSV files
        Map<String, Integer> studentScores = new HashMap<>();

        for (File file : folder.listFiles()) {
            if (!file.getName().endsWith(".csv")) continue;

            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = br.readLine()) != null) {
                    try {
                        // Validate line format
                        if (!LINE_PATTERN.matcher(line).matches()) {
                            throw new Exception("Invalid format");
                        }

                        AnswerSheet<Character> sheet = parseLine(line);
                        int score = calculateScore(sheet.getAnswers(), answerKey);
                        studentScores.put(sheet.getStudentName(), score);

                    } catch (Exception e) {
                        System.out.println("Skipping invalid line: " + line);
                    }
                }
            } catch (IOException e) {
                System.out.println("Failed to read file: " + file.getName());
            }
        }

        // Sort students using PriorityQueue (highest score first)
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
                (a, b) -> b.getValue() - a.getValue()
        );
        pq.addAll(studentScores.entrySet());

        System.out.println("\nExam Results (Top to Bottom):");
        while (!pq.isEmpty()) {
            Map.Entry<String, Integer> entry = pq.poll();
            System.out.println(entry.getKey() + " -> Score: " + entry.getValue());
        }
    }

    private static List<Character> parseAnswerKey(String line) {
        String[] parts = line.split(",");
        List<Character> key = new ArrayList<>();
        for (String s : parts) {
            key.add(s.charAt(0));
        }
        return key;
    }

    private static AnswerSheet<Character> parseLine(String line) throws Exception {
        String[] parts = line.split(",");
        String studentName = parts[0];
        List<Character> answers = new ArrayList<>();
        for (int i = 1; i < parts.length; i++) {
            char ans = parts[i].charAt(0);
            if (ans < 'A' || ans > 'D') throw new Exception("Invalid answer");
            answers.add(ans);
        }
        return new AnswerSheet<>(studentName, answers);
    }

    private static int calculateScore(List<Character> answers, List<Character> answerKey) {
        int score = 0;
        for (int i = 0; i < Math.min(answers.size(), answerKey.size()); i++) {
            if (answers.get(i).equals(answerKey.get(i))) score++;
        }
        return score;
    }
}

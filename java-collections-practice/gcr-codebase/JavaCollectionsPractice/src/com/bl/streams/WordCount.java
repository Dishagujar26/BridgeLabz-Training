package com.bl.streams;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

public class WordCount {

    public static void main(String[] args) {

        Map<String, Integer> wordCountMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(
                new FileReader("C:\\Users\\acer\\OneDrive\\Desktop\\csvfile - Copy.txt"))) {

            String line;

            while ((line = br.readLine()) != null) {

                String[] words = line
                        .toLowerCase()
                        .replaceAll("[^a-z ]", "")
                        .split("\\s+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCountMap.put(
                                word,
                                wordCountMap.getOrDefault(word, 0) + 1
                        );
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Sort and get top 5 words
        List<Map.Entry<String, Integer>> topWords =
                wordCountMap.entrySet()
                        .stream()
                        .sorted((e1, e2) -> e2.getValue() - e1.getValue())
                        .limit(5)
                        .collect(Collectors.toList());

        System.out.println("Top 5 most frequent words:");
        for (Map.Entry<String, Integer> entry : topWords) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

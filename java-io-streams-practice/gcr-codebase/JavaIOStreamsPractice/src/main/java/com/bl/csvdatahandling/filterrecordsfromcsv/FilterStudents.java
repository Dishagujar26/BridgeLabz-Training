package com.bl.csvdatahandling.filterrecordsfromcsv;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FilterStudents {
    public static void main(String[] args) {
        String filePath = "D:\\scenariospecifidir\\data\\students.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine(); // skip header

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int marks = Integer.parseInt(data[3]);

                if (marks > 80) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

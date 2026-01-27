package com.bl.csvdatahandling.readcsvfileandprintdata;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadStudentCSV {
    public static void main(String[] args) {
        String filePath = "D:\\scenariospecifidir\\data\\students.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine(); // skip header

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                System.out.println(
                    "ID: " + data[0] +
                    ", Name: " + data[1] +
                    ", Age: " + data[2] +
                    ", Marks: " + data[3]
                );
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

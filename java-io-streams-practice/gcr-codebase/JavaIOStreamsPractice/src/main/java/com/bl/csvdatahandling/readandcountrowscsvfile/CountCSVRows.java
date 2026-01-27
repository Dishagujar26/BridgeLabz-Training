package com.bl.csvdatahandling.readandcountrowscsvfile;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountCSVRows {
    public static void main(String[] args) {
        String filePath = "D:\\scenariospecifidir\\data\\students.csv";
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            br.readLine(); // skip header

            while (br.readLine() != null) {
                count++;
            }

            System.out.println("Total records (excluding header): " + count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

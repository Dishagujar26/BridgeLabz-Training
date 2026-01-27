package com.bl.csvdatahandling.searchforarecordincsv;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SearchEmployee {
    public static void main(String[] args) {
        String filePath = "D:\\scenariospecifidir\\data\\employees.csv";
        String searchName = "Ravi";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine(); // skip header

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                if (data[1].equalsIgnoreCase(searchName)) {
                    System.out.println("Department: " + data[2]);
                    System.out.println("Salary: " + data[3]);
                    return;
                }
            }
            System.out.println("Employee not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package com.bl.csvdatahandling.sortcsvrecordsbyacolumn;
import java.io.*;
import java.util.*;

public class SortBySalary {
    public static void main(String[] args) {
        String filePath = "D:\\scenariospecifidir\\data\\employees.csv";
        List<String[]> records = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            br.readLine(); // skip header
            String line;

            while ((line = br.readLine()) != null) {
                records.add(line.split(","));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        records.sort((a, b) ->
            Integer.parseInt(b[3]) - Integer.parseInt(a[3])
        );

        System.out.println("Top 5 highest paid employees:");
        for (int i = 0; i < Math.min(5, records.size()); i++) {
            System.out.println(String.join(",", records.get(i)));
        }
    }
}

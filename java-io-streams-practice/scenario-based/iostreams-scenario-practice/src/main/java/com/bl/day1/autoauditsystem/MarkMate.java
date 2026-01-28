package com.bl.day1.autoauditsystem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class MarkMate {

    public static void main(String[] args) throws Exception {

        List<ReportCard> reports = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("D:\\scenariospecifidir\\marks.csv"));

        br.readLine(); // skip header
        String line;

        while ((line = br.readLine()) != null) {
            try {
                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];

                int m1 = Integer.parseInt(data[2]);
                int m2 = Integer.parseInt(data[3]);
                int m3 = Integer.parseInt(data[4]);

                int total = m1 + m2 + m3;
                double avg = total / 3.0;
                String grade = GradeUtil.calculateGrade(avg);

                reports.add(new ReportCard(id, name, total, avg, grade));

            } catch (Exception e) {
                System.out.println("Invalid record skipped: " + line);
            }
        }

        ObjectMapper mapper = new ObjectMapper();
        mapper.writerWithDefaultPrettyPrinter()
              .writeValue(new File("report-card.json"), reports);

        System.out.println("JSON Report Generated Successfully");
    }
}

package com.bl.csvdatahandling.mergetwocsvfiles;
import java.io.*;
import java.util.*;

public class MergeCSVFiles {

    public static void main(String[] args) throws Exception {

        Map<String, Student> map = new HashMap<>();

        // Read students1.csv
        BufferedReader br1 = new BufferedReader(new FileReader("D:\\scenariospecifidir\\student1.csv"));
        String line;
        br1.readLine(); // skip header

        while ((line = br1.readLine()) != null) {
            String[] data = line.split(",");

            Student s = new Student();
            s.id = data[0];
            s.name = data[1];
            s.age = Integer.parseInt(data[2]);

            map.put(s.id, s);
        }
        br1.close();

        // Read students2.csv
        BufferedReader br2 = new BufferedReader(new FileReader("D:\\scenariospecifidir\\student2.csv"));
        br2.readLine(); // skip header

        while ((line = br2.readLine()) != null) {
            String[] data = line.split(",");

            Student s = map.get(data[0]);
            if (s != null) {
                s.marks = Integer.parseInt(data[1]);
                s.grade = data[2];
            }
        }
        br2.close();

        // Write merged CSV
        FileWriter fw = new FileWriter("merged_students.csv");
        fw.write("ID,Name,Age,Marks,Grade\n");

        for (Student s : map.values()) {
            fw.write(
                s.id + "," +
                s.name + "," +
                s.age + "," +
                s.marks + "," +
                s.grade + "\n"
            );
        }
        fw.close();

        System.out.println("CSV files merged successfully");
    }
}

package com.bl.csvdatahandling.convertcsvdataintojavaobjects;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CSVToStudentObject {

    public static void main(String[] args) throws Exception {

        List<Student> students = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("D:\\scenariospecifidir\\students.csv"));
        String line;

        br.readLine(); // skip header

        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");

            Student s = new Student();
            s.id = data[0];
            s.name = data[1];
            s.email = data[2];
            s.phone = data[3];

            students.add(s);
        }

        br.close();

        for (Student s : students) {
            System.out.println(s);
        }
    }
}


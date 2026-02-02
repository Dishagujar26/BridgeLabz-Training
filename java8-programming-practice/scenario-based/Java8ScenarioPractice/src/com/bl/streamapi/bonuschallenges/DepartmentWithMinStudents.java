package com.bl.streamapi.bonuschallenges;
import java.util.*;
import java.util.stream.*;

public class DepartmentWithMinStudents {
    public static void main(String[] args) {
        List<Student> students = StudentData.getStudents();

        String department =
                students.stream()
                        .collect(Collectors.groupingBy(
                                Student::getDepartment,
                                Collectors.counting()))
                        .entrySet().stream()
                        .min(Map.Entry.comparingByValue())
                        .get()
                        .getKey();

        System.out.println(department);
    }
}

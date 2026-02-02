package com.bl.streamapi.bonuschallenges;
import java.util.*;
import java.util.stream.*;

public class PartitionByRank {
    public static void main(String[] args) {
        List<Student> students = StudentData.getStudents();

        Map<Boolean, List<Student>> result =
                students.stream()
                        .collect(Collectors.partitioningBy(s -> s.getRank() < 100));

        System.out.println(result);
    }
}

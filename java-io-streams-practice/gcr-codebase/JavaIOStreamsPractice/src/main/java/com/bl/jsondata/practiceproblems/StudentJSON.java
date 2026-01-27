package com.bl.jsondata.practiceproblems;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public class StudentJSON {
    public static void main(String[] args) throws Exception {
        // Create Student data
        Map<String, Object> student = new HashMap<>();
        student.put("name", "Disha");
        student.put("age", 22);
        student.put("subjects", Arrays.asList("Math", "Physics", "English"));

        // Convert to JSON
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);

        System.out.println(jsonString);
    }
}

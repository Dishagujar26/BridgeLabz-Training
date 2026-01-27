package com.bl.jsondata.practiceproblems.validatejsonstructure;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class ValidateJSON {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            // Read JSON file into User array
            User[] users = mapper.readValue(new File("D:\\scenariospecifidir\\users.json"), User[].class);
            System.out.println("JSON is valid!");
        } catch (Exception e) {
            System.out.println("Invalid JSON structure: " + e.getMessage());
        }
    }
}

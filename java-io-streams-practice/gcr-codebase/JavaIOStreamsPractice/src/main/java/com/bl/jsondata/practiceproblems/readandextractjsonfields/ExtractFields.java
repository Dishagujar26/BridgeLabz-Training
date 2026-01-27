package com.bl.jsondata.practiceproblems.readandextractjsonfields;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class ExtractFields {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(new File("D:\\scenariospecifidir\\users.json"));

        for (JsonNode user : root) {
            String name = user.get("name").asText();
            String email = user.get("email").asText();
            System.out.println("Name: " + name + ", Email: " + email);
        }
    }
}

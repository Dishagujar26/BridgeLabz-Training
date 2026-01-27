package com.bl.jsondata.practiceproblems.parseandfilter;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class FilterJSON {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(new File("users.json"));

        for (JsonNode user : root) {
            int age = user.get("age").asInt();
            if (age > 25) {
                System.out.println(user.toPrettyString());
            }
        }
    }
}

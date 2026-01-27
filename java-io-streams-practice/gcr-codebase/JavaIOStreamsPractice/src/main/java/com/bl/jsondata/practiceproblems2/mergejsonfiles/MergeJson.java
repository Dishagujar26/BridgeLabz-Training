package com.bl.jsondata.practiceproblems2.mergejsonfiles;
import java.io.File;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class MergeJson {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode json1 = mapper.readTree(new File("D:\\scenariospecifidir\\file1.json"));
        JsonNode json2 = mapper.readTree(new File("D:\\scenariospecifidir\\file2.json"));

        ObjectNode merged = mapper.createObjectNode();
        merged.setAll((ObjectNode) json1);
        merged.setAll((ObjectNode) json2);

        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(merged));
        // Notice that Alice and Bob are gone because the "users" array from file2 overwrote the one from file1.
    
        // get the proper output 
        
        System.out.println("\nProper Output:\n");
        // Merge all top-level keys except "users"
        json1.fieldNames().forEachRemaining(field -> {
            if (!field.equals("users")) {
                merged.set(field, json1.get(field));
            }
        });
        json2.fieldNames().forEachRemaining(field -> {
            if (!field.equals("users")) {
                merged.set(field, json2.get(field));
            }
        });

        // Merge "users" arrays
        ArrayNode mergedUsers = mapper.createArrayNode();
        if (json1.has("users") && json1.get("users").isArray()) {
            mergedUsers.addAll((ArrayNode) json1.get("users"));
        }
        if (json2.has("users") && json2.get("users").isArray()) {
            mergedUsers.addAll((ArrayNode) json2.get("users"));
        }
        merged.set("users", mergedUsers);

        // Print merged JSON
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(merged));
    }
}

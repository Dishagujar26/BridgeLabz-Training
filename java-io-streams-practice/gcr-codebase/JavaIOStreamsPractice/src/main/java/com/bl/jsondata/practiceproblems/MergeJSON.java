package com.bl.jsondata.practiceproblems;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class MergeJSON {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        ObjectNode json1 = mapper.createObjectNode();
        json1.put("name", "Disha");
        json1.put("age", 22);

        ObjectNode json2 = mapper.createObjectNode();
        json2.put("email", "disha@example.com");
        json2.put("city", "Mumbai");

        // Merge
        json1.setAll(json2);

        String mergedJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(json1);
        System.out.println(mergedJson);
    }
}

package com.bl.jsondata.practiceproblems2.readjson;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class ReadJsonExample {
    @SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(new File("D:\\scenariospecifidir\\data.json"));
        root.fields().forEachRemaining(entry -> {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        });
    }
}

package com.bl.jsondata.practiceproblems2.filterjsondata;

import java.io.File;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FilterJson {
	public static void main(String[] args) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		JsonNode root = mapper.readTree(new File("D:\\scenariospecifidir\\data.json"));

		// Check if "users" exists and is an array
		JsonNode users = root.get("users");
		if (users != null && users.isArray()) {
			for (JsonNode user : users) {
				JsonNode ageNode = user.get("age");
				if (ageNode != null && ageNode.asInt() > 25) {
					System.out.println("Name: " + user.get("name").asText() + ", Email: " + user.get("email").asText());
				}
			}
		} else {
			System.out.println("\"users\" key not found or is not an array!");
		}
	}
}

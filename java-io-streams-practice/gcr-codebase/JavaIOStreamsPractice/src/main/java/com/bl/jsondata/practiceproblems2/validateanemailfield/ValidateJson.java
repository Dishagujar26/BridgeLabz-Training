package com.bl.jsondata.practiceproblems2.validateanemailfield;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONArray;
import org.json.JSONObject;

public class ValidateJson {

	public static void main(String[] args) throws Exception {
		// Read JSON Schema
		String schemaStr = new String(Files.readAllBytes(Paths.get("D:\\scenariospecifidir\\schema.json")));
		Schema schema = SchemaLoader.load(new JSONObject(schemaStr));

		// Read JSON data
		String dataStr = new String(Files.readAllBytes(Paths.get("D:\\scenariospecifidir\\data.json")));
		JSONObject root = new JSONObject(dataStr);

		// Get the "users" array
		JSONArray users = root.getJSONArray("users");

		// Validate each user's email
		for (int i = 0; i < users.length(); i++) {
			JSONObject user = users.getJSONObject(i);
			try {
				schema.validate(user); // validate according to schema
				System.out.println("User " + user.getString("name") + " email is valid: " + user.getString("email"));
			} catch (Exception e) {
				System.out.println("User " + user.getString("name") + " email is INVALID: " + user.getString("email"));
			}
		}
	}
}
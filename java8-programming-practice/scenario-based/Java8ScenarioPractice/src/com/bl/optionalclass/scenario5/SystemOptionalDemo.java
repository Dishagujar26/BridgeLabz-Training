package com.bl.optionalclass.scenario5;

import java.util.*;

public class SystemOptionalDemo {
	public static void main(String[] args) {
		Map<String, String> config = Map.of("url", "http://localhost");

		// 1. Config value
		String url = Optional.ofNullable(config.get("url")).orElse("http://default.com");
		System.out.println("URL: " + url);

		// 2. Environment variable
		String env = Optional.ofNullable(System.getenv("JAVA_HOME")).orElse("Not set");
		System.out.println("JAVA_HOME: " + env);

		// 3. Default file path
		String filePath = Optional.ofNullable(config.get("filePath")).orElse("/tmp/default.txt");
		System.out.println("File Path: " + filePath);

		// 4. API response
		Optional<String> apiResponse = Optional.ofNullable(null);
		System.out.println("API Response: " + apiResponse.orElse("No response"));

		// 5. User preferences
		Map<String, String> prefs = new HashMap<>();
		String theme = Optional.ofNullable(prefs.get("theme")).orElse("light");
		System.out.println("Theme: " + theme);
	}
}

package com.bl.day2.messagingpatternanalyzer;

import java.io.File;
import java.util.List;
import java.util.Map;

/*
 7. ChatLogParser – Messaging Pattern Analyzer
Story: A company wants to analyze employee chat logs for productivity. The logs are stored in
plain text files like:
[12:02 PM] John: Hey, the build failed again!
[12:03 PM] Mary: I’ll check the Jenkins pipeline.
Your task is to build ChatLogParser, a tool that:
● Reads chat logs using BufferedReader
● Uses Regex to extract timestamp, user, and message
● Stores results in a Map<String, List<String>> (user → messages)
● Filters out “idle chat” based on keyword list ("lol", "brb", etc.)
● Uses TreeMap to automatically sort users alphabetically
● Supports generic filtering rules using interfaces like MessageFilter<T>
*/
public class Main {
	public static void main(String[] args) throws Exception {
		ChatLogParser parser = new ChatLogParser();
		parser.addFilter(new IdleChatFilter());

		File file = new File("D:\\scenariospecifidir\\catalog.txt");
		System.out.println(file.exists()); // should print true

		Map<String, List<String>> chats = parser.parseChat(new File("D:\\scenariospecifidir\\catalog.txt"));

		chats.forEach((user, messages) -> {
			System.out.println(user + " -> " + messages);
		});
	}
}

package com.bl.day2.messagingpatternanalyzer;
import java.io.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.*;

public class ChatLogParser {

    private static final Pattern CHAT_PATTERN =
            Pattern.compile("\\[(\\d{1,2}:\\d{2} (?:AM|PM))\\] (\\w+): (.+)");

    private List<MessageFilter<ChatMessage>> filters = new ArrayList<>();

    // Register filters
    public void addFilter(MessageFilter<ChatMessage> filter) {
        filters.add(filter);
    }

    public Map<String, List<String>> parseChat(File file) throws IOException {
        TreeMap<String, List<String>> userMessages = new TreeMap<>(); // alphabetically sorted

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h:mm a", Locale.ENGLISH);

            while ((line = br.readLine()) != null) {
            	 Matcher matcher = CHAT_PATTERN.matcher(line);
            	    if (matcher.matches()) {
            	        String timeStr = matcher.group(1).trim().toUpperCase();
            	        LocalTime time = LocalTime.parse(timeStr, formatter);
            	        String user = matcher.group(2);
            	        String message = matcher.group(3);

            	        ChatMessage chatMessage = new ChatMessage(time, user, message);

                    // Apply all filters
                    boolean discard = false;
                    for (MessageFilter<ChatMessage> filter : filters) {
                        if (!filter.filter(chatMessage)) {
                            discard = true;
                            break;
                        }
                    }
                    if (discard) continue;

                    // Add to map
                    userMessages.computeIfAbsent(user, k -> new ArrayList<>()).add(message);
                }
            }
        }

        return userMessages;
    }
}

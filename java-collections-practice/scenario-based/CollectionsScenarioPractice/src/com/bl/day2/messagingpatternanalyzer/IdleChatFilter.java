package com.bl.day2.messagingpatternanalyzer;

import java.util.Arrays;
import java.util.List;

public class IdleChatFilter implements MessageFilter<ChatMessage> {
	private List<String> idleKeywords = Arrays.asList("lol", "brb", "omg", "ttyl");

	@Override
	public boolean filter(ChatMessage message) {
		String msg = message.getMessage().toLowerCase();
		for (String keyword : idleKeywords) {
			if (msg.contains(keyword))
				return false; // filter out
		}
		return true; // keep message
	}
}

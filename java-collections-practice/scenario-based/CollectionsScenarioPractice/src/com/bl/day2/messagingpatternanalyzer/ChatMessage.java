package com.bl.day2.messagingpatternanalyzer;
import java.time.LocalTime;

public class ChatMessage {
    private LocalTime timestamp;
    private String user;
    private String message;

    public ChatMessage(LocalTime timestamp, String user, String message) {
        this.timestamp = timestamp;
        this.user = user;
        this.message = message;
    }

    public LocalTime getTimestamp() { return timestamp; }
    public String getUser() { return user; }
    public String getMessage() { return message; }

    @Override
    public String toString() {
        return "[" + timestamp + "] " + user + ": " + message;
    }
}

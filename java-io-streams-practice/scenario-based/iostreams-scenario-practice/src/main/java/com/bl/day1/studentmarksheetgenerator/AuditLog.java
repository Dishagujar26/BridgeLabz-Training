package com.bl.day1.studentmarksheetgenerator;

import java.time.LocalDateTime;

public class AuditLog {
    public String event;
    public String className;
    public String methodName;
    public LocalDateTime timestamp;

    public AuditLog(String event, String className, String methodName, LocalDateTime timestamp) {
        this.event = event;
        this.className = className;
        this.methodName = methodName;
        this.timestamp = timestamp;
    }
}

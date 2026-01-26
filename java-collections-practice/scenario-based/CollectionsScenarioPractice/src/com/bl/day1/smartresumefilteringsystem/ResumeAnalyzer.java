package com.bl.day1.smartresumefilteringsystem;
import java.util.regex.Pattern;

public class ResumeAnalyzer {

    public static final Pattern EMAIL_PATTERN =
            Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");

    public static final Pattern PHONE_PATTERN =
            Pattern.compile("\\b\\d{10}\\b");

    public static final Pattern KEYWORDS_PATTERN =
            Pattern.compile("\\b(Java|Python|Spring)\\b", Pattern.CASE_INSENSITIVE);

}

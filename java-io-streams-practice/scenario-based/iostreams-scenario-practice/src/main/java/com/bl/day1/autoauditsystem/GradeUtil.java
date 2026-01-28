package com.bl.day1.autoauditsystem;

public class GradeUtil {

    public static String calculateGrade(double avg) {
        if (avg >= 90) return "A";
        if (avg >= 75) return "B";
        if (avg >= 60) return "C";
        return "D";
    }
}

package com.bl.day1.autoauditsystem;

public class ReportCard {
    public int id;
    public String name;
    public int total;
    public double average;
    public String grade;

    public ReportCard(int id, String name, int total, double average, String grade) {
        this.id = id;
        this.name = name;
        this.total = total;
        this.average = average;
        this.grade = grade;
    }
}

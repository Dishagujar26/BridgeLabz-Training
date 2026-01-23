package com.bl.day9.universitydigitalrecordsystem;

public class StudentNode {
    int rollNumber;
    String name;
    StudentNode left, right;

    StudentNode(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
        left = right = null; // initially no children
    }
}


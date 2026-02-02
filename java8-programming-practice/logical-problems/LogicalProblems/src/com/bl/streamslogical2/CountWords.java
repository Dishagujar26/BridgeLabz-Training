package com.bl.streamslogical2;
import java.util.*;
public class CountWords {
    public static void main(String[] args) {
        String s = "Java is very powerful";
        long count = Arrays.stream(s.split("\\s+")).count();
        System.out.println(count);
    }
}

package com.bl.streamslogical2;
import java.util.*;
public class CountStartsWithA {
    public static void main(String[] args) {
        List<String> list = List.of("apple","banana","ant","car");
        long count = list.stream()
                         .filter(s -> s.startsWith("a"))
                         .count();
        System.out.println(count);
    }
}

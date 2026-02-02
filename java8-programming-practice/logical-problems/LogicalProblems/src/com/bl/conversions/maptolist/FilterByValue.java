package com.bl.conversions.maptolist;
import java.util.*;
import java.util.stream.*;

public class FilterByValue {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("A", 5, "B", 15, "C", 25);

        List<String> list =
                map.entrySet().stream()
                   .filter(e -> e.getValue() > 10)
                   .map(Map.Entry::getKey)
                   .collect(Collectors.toList());

        System.out.println(list);
    }
}

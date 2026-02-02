package com.bl.conversions.maptolist;
import java.util.*;
import java.util.stream.*;

public class MapSortedByValue {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("A", 30, "B", 10, "C", 20);

        List<Map.Entry<String, Integer>> list =
                map.entrySet().stream()
                   .sorted(Map.Entry.comparingByValue())
                   .collect(Collectors.toList());

        System.out.println(list);
    }
}

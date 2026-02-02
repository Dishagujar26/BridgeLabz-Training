package com.bl.conversions.maptolist;
import java.util.*;
import java.util.stream.*;

public class MapSortedByKey {
    public static void main(String[] args) {
        Map<Integer, String> map = Map.of(3, "C", 1, "A", 2, "B");

        List<Map.Entry<Integer, String>> list =
                map.entrySet().stream()
                   .sorted(Map.Entry.comparingByKey())
                   .collect(Collectors.toList());

        System.out.println(list);
    }
}

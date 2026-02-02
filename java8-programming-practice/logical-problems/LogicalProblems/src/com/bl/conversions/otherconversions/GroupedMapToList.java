package com.bl.conversions.otherconversions;
import java.util.*;
import java.util.stream.*;

public class GroupedMapToList {
    public static void main(String[] args) {
        Map<Integer, List<String>> map =
                Map.of(2, List.of("Hi"), 4, List.of("Java"));

        List<String> list =
                map.values().stream()
                   .flatMap(List::stream)
                   .toList();

        System.out.println(list);
    }
}

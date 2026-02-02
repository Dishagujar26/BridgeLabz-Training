package com.bl.conversions.maptolist;
import java.util.*;
import java.util.stream.*;

public class MapToKeyValueStringList {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("Java", 8, "Spring", 5);

        List<String> list =
                map.entrySet().stream()
                   .map(e -> e.getKey() + "=" + e.getValue())
                   .collect(Collectors.toList());

        System.out.println(list);
    }
}

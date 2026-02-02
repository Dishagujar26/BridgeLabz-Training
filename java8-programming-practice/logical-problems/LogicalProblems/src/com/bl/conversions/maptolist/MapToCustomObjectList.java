package com.bl.conversions.maptolist;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapToCustomObjectList {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("A", 1, "B", 2);

        List<Pair> list =
                map.entrySet().stream()
                   .map(e -> new Pair(e.getKey(), e.getValue()))
                   .collect(Collectors.toList());

        System.out.println(list.size());
    }
}
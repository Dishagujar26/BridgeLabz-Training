package com.bl.conversions.maptolist;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapToDTOList {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("Alice", 90, "Bob", 80);

        List<DTO> list =
                map.entrySet().stream()
                   .map(e -> new DTO(e.getKey(), e.getValue()))
                   .collect(Collectors.toList());

        System.out.println(list.size());
    }
}
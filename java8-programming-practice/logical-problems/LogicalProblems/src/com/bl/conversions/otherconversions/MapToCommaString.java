package com.bl.conversions.otherconversions;
import java.util.*;
import java.util.stream.*;

public class MapToCommaString {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("A", 1, "B", 2);

        String result =
                map.entrySet().stream()
                   .map(e -> e.getKey() + "=" + e.getValue())
                   .collect(Collectors.joining(","));

        System.out.println(result);
    }
}

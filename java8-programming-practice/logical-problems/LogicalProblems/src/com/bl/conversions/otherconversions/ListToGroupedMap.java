package com.bl.conversions.otherconversions;
import java.util.*;
import java.util.stream.*;

public class ListToGroupedMap {
    public static void main(String[] args) {
        List<String> list = List.of("Java", "API", "Code");

        Map<Integer, List<String>> map =
                list.stream()
                    .collect(Collectors.groupingBy(String::length));

        System.out.println(map);
    }
}

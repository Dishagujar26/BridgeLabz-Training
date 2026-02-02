package com.bl.conversions.listtomap;
import java.util.*;
import java.util.stream.*;

public class GroupByLengthMap {
    public static void main(String[] args) {
        List<String> list = List.of("Java", "API", "Spring");

        Map<Integer, List<String>> map =
                list.stream()
                    .collect(Collectors.groupingBy(String::length));

        System.out.println(map);
    }
}

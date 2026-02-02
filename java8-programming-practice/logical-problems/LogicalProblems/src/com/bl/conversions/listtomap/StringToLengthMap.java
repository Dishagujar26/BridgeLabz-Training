package com.bl.conversions.listtomap;
import java.util.*;
import java.util.stream.*;

public class StringToLengthMap {
    public static void main(String[] args) {
        List<String> list = List.of("Java", "Spring", "Boot");

        Map<String, Integer> map =
                list.stream()
                    .collect(Collectors.toMap(s -> s, String::length));

        System.out.println(map);
    }
}

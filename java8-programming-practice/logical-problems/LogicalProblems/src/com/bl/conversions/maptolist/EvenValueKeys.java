package com.bl.conversions.maptolist;
import java.util.*;
import java.util.stream.*;

public class EvenValueKeys {
    public static void main(String[] args) {
        Map<Integer, Integer> map = Map.of(1, 10, 2, 15, 3, 20);

        List<Integer> keys =
                map.entrySet().stream()
                   .filter(e -> e.getValue() % 2 == 0)
                   .map(Map.Entry::getKey)
                   .collect(Collectors.toList());

        System.out.println(keys);
    }
}

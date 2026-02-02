package com.bl.conversions.maptolist;
import java.util.*;

public class MapEntriesToList {
    public static void main(String[] args) {
        Map<Integer, String> map = Map.of(1, "A", 2, "B");

        List<Map.Entry<Integer, String>> list =
                new ArrayList<>(map.entrySet());

        System.out.println(list);
    }
}

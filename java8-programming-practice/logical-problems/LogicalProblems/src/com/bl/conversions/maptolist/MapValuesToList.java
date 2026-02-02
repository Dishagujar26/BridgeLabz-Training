package com.bl.conversions.maptolist;
import java.util.*;

public class MapValuesToList {
    public static void main(String[] args) {
        Map<Integer, String> map = Map.of(1, "Java", 2, "Spring");

        List<String> values = new ArrayList<>(map.values());
        System.out.println(values);
    }
}

package com.bl.conversions.maptolist;
import java.util.*;

public class MapKeysToList {
    public static void main(String[] args) {
        Map<Integer, String> map = Map.of(1, "A", 2, "B");

        List<Integer> keys = new ArrayList<>(map.keySet());
        System.out.println(keys);
    }
}

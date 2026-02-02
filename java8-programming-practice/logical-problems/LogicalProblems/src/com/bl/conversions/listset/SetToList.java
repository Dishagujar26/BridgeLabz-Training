package com.bl.conversions.listset;
import java.util.*;

public class SetToList {
    public static void main(String[] args) {
        Set<String> set = Set.of("A", "B", "C");

        List<String> list = new ArrayList<>(set);
        System.out.println(list);
    }
}

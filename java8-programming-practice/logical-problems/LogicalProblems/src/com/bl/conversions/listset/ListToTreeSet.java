package com.bl.conversions.listset;
import java.util.*;

public class ListToTreeSet {
    public static void main(String[] args) {
        List<Integer> list = List.of(5, 2, 3, 1);

        Set<Integer> set = new TreeSet<>(list);
        System.out.println(set);
    }
}

package com.bl.conversions.listset;
import java.util.*;

public class ListToSet {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 2, 3);

        Set<Integer> set = new HashSet<>(list);
        System.out.println(set);
    }
}

package com.bl.conversions.listset;
import java.util.*;

public class SetToSortedList {
    public static void main(String[] args) {
        Set<Integer> set = Set.of(4, 1, 3);

        List<Integer> list = set.stream()
                                .sorted()
                                .toList();

        System.out.println(list);
    }
}

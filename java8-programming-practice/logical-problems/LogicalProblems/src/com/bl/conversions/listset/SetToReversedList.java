package com.bl.conversions.listset;
import java.util.*;
import java.util.stream.*;

public class SetToReversedList {
    public static void main(String[] args) {
        Set<Integer> set = Set.of(1, 2, 3);

        List<Integer> list =
                set.stream()
                   .sorted(Comparator.reverseOrder())
                   .collect(Collectors.toList());

        System.out.println(list);
    }
}

package com.bl.conversions.listset;
import java.util.*;
import java.util.stream.*;

public class MergeListsToSet {
    public static void main(String[] args) {
        List<Integer> l1 = List.of(1, 2, 3);
        List<Integer> l2 = List.of(3, 4, 5);

        Set<Integer> set =
                Stream.concat(l1.stream(), l2.stream())
                      .collect(Collectors.toSet());

        System.out.println(set);
    }
}

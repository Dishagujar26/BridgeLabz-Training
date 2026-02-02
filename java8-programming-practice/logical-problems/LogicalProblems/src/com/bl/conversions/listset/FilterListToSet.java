package com.bl.conversions.listset;
import java.util.*;
import java.util.stream.*;

public class FilterListToSet {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);

        Set<Integer> set =
                list.stream()
                    .filter(n -> n > 3)
                    .collect(Collectors.toSet());

        System.out.println(set);
    }
}

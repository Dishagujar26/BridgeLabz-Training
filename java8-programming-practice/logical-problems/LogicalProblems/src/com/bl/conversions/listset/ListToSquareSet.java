package com.bl.conversions.listset;
import java.util.*;
import java.util.stream.*;

public class ListToSquareSet {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3);

        Set<Integer> set =
                list.stream()
                    .map(n -> n * n)
                    .collect(Collectors.toSet());

        System.out.println(set);
    }
}

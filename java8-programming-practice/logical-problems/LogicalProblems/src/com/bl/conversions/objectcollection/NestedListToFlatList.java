package com.bl.conversions.objectcollection;
import java.util.*;
import java.util.stream.*;

public class NestedListToFlatList {
    public static void main(String[] args) {
        List<List<Integer>> list = List.of(
            List.of(1,2),
            List.of(3,4)
        );

        List<Integer> flat =
                list.stream()
                    .flatMap(List::stream)
                    .toList();

        System.out.println(flat);
    }
}

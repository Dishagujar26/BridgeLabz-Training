package com.bl.conversions.listset;
import java.util.*;

public class ListToLinkedHashSet {
    public static void main(String[] args) {
        List<Integer> list = List.of(3, 1, 2, 2);

        Set<Integer> set = new LinkedHashSet<>(list);
        System.out.println(set);
    }
}

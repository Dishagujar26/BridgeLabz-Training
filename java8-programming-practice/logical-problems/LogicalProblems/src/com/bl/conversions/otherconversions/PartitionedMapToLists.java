package com.bl.conversions.otherconversions;
import java.util.*;
import java.util.stream.*;

public class PartitionedMapToLists {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4);

        Map<Boolean, List<Integer>> map =
                list.stream()
                    .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        List<Integer> even = map.get(true);
        List<Integer> odd = map.get(false);

        System.out.println(even);
        System.out.println(odd);
    }
}

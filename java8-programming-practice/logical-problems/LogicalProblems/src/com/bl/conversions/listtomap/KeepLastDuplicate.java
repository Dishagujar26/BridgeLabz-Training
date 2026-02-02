package com.bl.conversions.listtomap;
import java.util.*;
import java.util.stream.*;

public class KeepLastDuplicate {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 1, 3);

        Map<Integer, Integer> map =
                list.stream()
                    .collect(Collectors.toMap(
                            n -> n,
                            n -> n,
                            (a, b) -> b));

        System.out.println(map);
    }
}

package com.bl.conversions.listtomap;
import java.util.*;
import java.util.stream.*;

public class NumberToSquareMap {
    public static void main(String[] args) {
        List<Integer> list = List.of(2, 3, 4);

        Map<Integer, Integer> map =
                list.stream()
                    .collect(Collectors.toMap(n -> n, n -> n * n));

        System.out.println(map);
    }
}

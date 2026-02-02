package com.bl.conversions.arraycollection;
import java.util.*;
import java.util.stream.*;

public class ArrayToMapValueKey {
    public static void main(String[] args) {
        String[] arr = {"A", "B"};

        Map<String, Integer> map =
                IntStream.range(0, arr.length)
                         .boxed()
                         .collect(Collectors.toMap(i -> arr[i], i -> i));

        System.out.println(map);
    }
}

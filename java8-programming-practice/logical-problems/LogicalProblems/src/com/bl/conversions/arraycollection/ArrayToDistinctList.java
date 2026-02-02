package com.bl.conversions.arraycollection;
import java.util.*;
import java.util.stream.*;

public class ArrayToDistinctList {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 2, 3};

        List<Integer> list =
                Arrays.stream(arr)
                      .distinct()
                      .collect(Collectors.toList());

        System.out.println(list);
    }
}

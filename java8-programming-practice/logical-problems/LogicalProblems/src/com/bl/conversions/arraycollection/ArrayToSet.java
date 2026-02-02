package com.bl.conversions.arraycollection;
import java.util.*;
import java.util.stream.*;

public class ArrayToSet {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 2, 3};

        Set<Integer> set = Arrays.stream(arr)
                                 .collect(Collectors.toSet());
        System.out.println(set);
    }
}

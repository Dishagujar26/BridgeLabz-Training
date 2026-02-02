package com.bl.conversions.arraycollection;
import java.util.*;
import java.util.stream.*;

public class IntArrayToList {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        List<Integer> list =
                Arrays.stream(arr)
                      .boxed()
                      .collect(Collectors.toList());

        System.out.println(list);
    }
}

package com.bl.conversions.arraycollection;
import java.util.*;
import java.util.stream.*;

public class TwoDArrayToList {
    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {3, 4}};

        List<Integer> list =
                Arrays.stream(arr)
                      .flatMapToInt(Arrays::stream)
                      .boxed()
                      .collect(Collectors.toList());

        System.out.println(list);
    }
}

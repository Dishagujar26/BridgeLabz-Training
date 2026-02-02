package com.bl.conversions.arraycollection;
import java.util.*;

public class ListToArray {
    public static void main(String[] args) {
        List<String> list = List.of("A", "B");

        String[] arr = list.toArray(new String[0]);
        System.out.println(Arrays.toString(arr));
    }
}

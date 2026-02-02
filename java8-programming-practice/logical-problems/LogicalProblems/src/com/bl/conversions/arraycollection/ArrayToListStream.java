package com.bl.conversions.arraycollection;
import java.util.*;
import java.util.stream.*;

public class ArrayToListStream {
    public static void main(String[] args) {
        String[] arr = {"Java", "Spring"};

        List<String> list = Arrays.stream(arr).toList();
        System.out.println(list);
    }
}

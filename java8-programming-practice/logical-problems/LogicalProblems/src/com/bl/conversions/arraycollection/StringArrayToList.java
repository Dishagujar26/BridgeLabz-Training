package com.bl.conversions.arraycollection;
import java.util.*;

public class StringArrayToList {
    public static void main(String[] args) {
        String[] arr = {"X", "Y"};

        List<String> list = Arrays.asList(arr);
        System.out.println(list);
    }
}

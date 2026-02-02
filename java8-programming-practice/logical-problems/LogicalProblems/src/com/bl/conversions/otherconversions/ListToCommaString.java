package com.bl.conversions.otherconversions;
import java.util.*;
import java.util.stream.*;

public class ListToCommaString {
    public static void main(String[] args) {
        List<String> list = List.of("Java", "Spring");

        String result = String.join(",", list);
        System.out.println(result);
    }
}

package com.bl.conversions.otherconversions;
import java.util.*;

public class OptionalToList {
    public static void main(String[] args) {
        Optional<String> opt = Optional.of("Java");

        List<String> list = opt.stream().toList();
        System.out.println(list);
    }
}

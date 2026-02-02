package com.bl.streamslogical2;
import java.util.*;
public class CountVowels {
    public static void main(String[] args) {
        String s = "programming";
        long count = s.chars()
                      .filter(c -> "aeiouAEIOU".indexOf(c) >= 0)
                      .count();
        System.out.println(count);
    }
}

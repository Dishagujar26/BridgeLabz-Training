package com.bl.streamslogical1;
import java.util.*;
import java.util.stream.*;

public class AllNonRepeatingChars {
    public static void main(String[] args) {
        String s = "programming";

        s.chars()
         .mapToObj(c -> (char) c)
         .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
         .entrySet().stream()
         .filter(e -> e.getValue() == 1)
         .map(Map.Entry::getKey)
         .forEach(c -> System.out.print(c + " "));
    }
}

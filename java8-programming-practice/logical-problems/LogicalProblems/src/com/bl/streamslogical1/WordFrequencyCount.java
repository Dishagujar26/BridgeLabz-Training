package com.bl.streamslogical1;
import java.util.*;
import java.util.stream.*;

public class WordFrequencyCount {
    public static void main(String[] args) {
        String s = "java is java and java is fast";

        Map<String, Long> map =
                Arrays.stream(s.split(" "))
                      .collect(Collectors.groupingBy(w -> w, Collectors.counting()));

        System.out.println(map);
    }
}

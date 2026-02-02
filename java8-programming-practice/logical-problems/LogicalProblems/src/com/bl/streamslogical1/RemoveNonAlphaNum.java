package com.bl.streamslogical1;
import java.util.*;
import java.util.stream.*;

public class RemoveNonAlphaNum {
    public static void main(String[] args) {
        String s = "ja@va#8!!";

        String result =
                s.chars()
                 .filter(Character::isLetterOrDigit)
                 .mapToObj(c -> String.valueOf((char) c))
                 .collect(Collectors.joining());

        System.out.println(result);
    }
}

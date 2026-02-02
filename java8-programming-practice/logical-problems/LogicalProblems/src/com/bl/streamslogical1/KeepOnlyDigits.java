package com.bl.streamslogical1;
import java.util.*;
import java.util.stream.*;

public class KeepOnlyDigits {
    public static void main(String[] args) {
        String s = "orderId=AB123XZ9";

        String result =
                s.chars()
                 .filter(Character::isDigit)
                 .mapToObj(c -> String.valueOf((char) c))
                 .collect(Collectors.joining());

        System.out.println(result);
    }
}

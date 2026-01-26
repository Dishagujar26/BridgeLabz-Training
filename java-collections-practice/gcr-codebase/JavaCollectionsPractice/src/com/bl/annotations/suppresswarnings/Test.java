package com.bl.annotations.suppresswarnings;
import java.util.ArrayList;

public class Test {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Java");
        list.add(10);
    }
}

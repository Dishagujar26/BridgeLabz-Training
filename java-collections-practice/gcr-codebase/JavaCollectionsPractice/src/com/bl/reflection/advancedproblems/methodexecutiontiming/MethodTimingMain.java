package com.bl.reflection.advancedproblems.methodexecutiontiming;

import java.lang.reflect.Method;

public class MethodTimingMain {
    public static void main(String[] args) throws Exception {

        Worker w = new Worker();
        Method m = w.getClass().getMethod("work");

        long start = System.nanoTime();
        m.invoke(w);
        long end = System.nanoTime();

        System.out.println("Time: " + (end - start) + " ns");
    }
}
package com.bl.annotations.logexecutiontime;
import java.lang.reflect.Method;

public class Service {

    @LogExecutionTime
    public void compute() {
        long start = System.nanoTime();
        // simulate work
        for (int i = 0; i < 100000; i++);
        long end = System.nanoTime();
        System.out.println("Execution Time: " + (end - start) + " ns");
    }

    public static void main(String[] args) throws Exception {
        Service s = new Service();
        Method m = Service.class.getDeclaredMethod("compute");

        if (m.isAnnotationPresent(LogExecutionTime.class)) {
            s.compute();
        }
    }
}

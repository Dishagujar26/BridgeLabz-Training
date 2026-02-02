package com.bl.streamapi.foreachexample;
import java.util.*;

public class SensorReading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> readings = new ArrayList<>();

        System.out.println("Enter sensor readings (type -1 to stop):");
        while (true) {
            double r = sc.nextDouble();
            if (r == -1) break;
            readings.add(r);
        }

        System.out.println("Enter threshold:");
        double threshold = sc.nextDouble();

        readings.stream()
                .filter(r -> r > threshold)
                .forEach(r ->
                        System.out.println("High Reading: " + r)
                );
    }
}

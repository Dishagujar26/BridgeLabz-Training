package com.bl.lambdaexpression.scenario5;
import java.util.*;

public class BasicLambda {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5);

        // 1. Run task in separate thread
        new Thread(() -> System.out.println("Task running in thread")).start();

        // 2. Print numbers from list
        nums.forEach(n -> System.out.println("Num: "+n));

        // 3. Check even or odd
        nums.forEach(n -> System.out.println(n+" is even? "+(n%2==0)));

        // 4. Add two numbers
        int a=5,b=10;
        Runnable add = () -> System.out.println("Sum: "+(a+b));
        add.run();

        // 5. Find greater of two numbers
        int x=15,y=20;
        Runnable greater = () -> System.out.println("Greater: "+Math.max(x,y));
        greater.run();
    }
}

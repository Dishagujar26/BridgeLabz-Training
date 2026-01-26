package com.bl.annotations.cacheresult;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class Calculator {

    private Map<Integer, Integer> cache = new HashMap<>();

    @CacheResult
    public int square(int x) {
        if (cache.containsKey(x)) {
            System.out.println("Returning cached result for " + x);
            return cache.get(x);
        }
        System.out.println("Computing square for " + x);
        int result = x * x;
        cache.put(x, result);
        return result;
    }

    public static void main(String[] args) throws Exception {
        Calculator calc = new Calculator();

        Method method = Calculator.class.getDeclaredMethod("square", int.class);
        if (method.isAnnotationPresent(CacheResult.class)) {
            System.out.println(calc.square(5)); // Computes
            System.out.println(calc.square(5)); // Cached
            System.out.println(calc.square(6)); // Computes
        }
    }
}

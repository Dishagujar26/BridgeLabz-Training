package com.bl.functionalinterfaces.function;
import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {

        // 1. Convert marks to grade
        Function<Integer, String> gradeFunc = marks -> {
            if (marks >= 90) return "A";
            else if (marks >= 75) return "B";
            else return "C";
        };
        System.out.println("Grade: " + gradeFunc.apply(82));

        // 2. Monthly to annual salary
        Function<Double, Double> annualSalary = m -> m * 12;
        System.out.println("Annual Salary: " + annualSalary.apply(2500.0));

        // 3. Price after 10% discount
        Function<Double, Double> discountedPrice = p -> p * 0.9;
        System.out.println("Discounted Price: " + discountedPrice.apply(500.0));

        // 4. Name to uppercase
        Function<String, String> upperName = String::toUpperCase;
        System.out.println("Uppercase Name: " + upperName.apply("john"));

        // 5. Celsius to Fahrenheit
        Function<Double, Double> cToF = c -> (c * 9/5) + 32;
        System.out.println("Fahrenheit: " + cToF.apply(37.0));
    }
}

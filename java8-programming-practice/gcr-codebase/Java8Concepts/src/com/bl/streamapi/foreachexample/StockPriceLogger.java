package com.bl.streamapi.foreachexample;
import java.util.*;

public class StockPriceLogger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> prices = new ArrayList<>();

        System.out.println("Enter stock prices (type -1 to stop):");
        while (true) {
            double p = sc.nextDouble();
            if (p == -1) break;
            prices.add(p);
        }

        prices.forEach(price ->
                System.out.println("Stock Price: " + price)
        );
    }
}

package com.bl.streamapi.foreachexample;
import java.time.LocalDateTime;
import java.util.*;

public class TransactionLogger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> transactions = new ArrayList<>();

        System.out.println("Enter transaction IDs (type 'end' to stop):");
        while (true) {
            String txn = sc.nextLine();
            if (txn.equalsIgnoreCase("end")) break;
            transactions.add(txn);
        }

        transactions.forEach(txn ->
                System.out.println(LocalDateTime.now() + " - Transaction: " + txn)
        );
    }
}

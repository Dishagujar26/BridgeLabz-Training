package com.bl.optionalclass.scenario3;
import java.util.*;

public class BankingOptionalDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("AC123", null, null, "TXN456", null);

        // 1. Nominee
        System.out.println("Nominee: " + acc.getNominee().orElse("No nominee"));

        // 2. Loan details (simulate)
        Optional<String> loan = Optional.ofNullable(null);
        System.out.println("Loan: " + loan.orElse("No loan"));

        // 3. Minimum balance if null
        double balance = acc.getBalance().orElse(500.0);
        System.out.println("Balance: " + balance);

        // 4. Transaction ref safely
        String txRef = acc.getTransactionRef().orElse("No transaction");
        System.out.println("Transaction: " + txRef);

        // 5. Credit card details
        System.out.println("Credit Card: " + acc.getCreditCard().orElse("No credit card"));
    }
}

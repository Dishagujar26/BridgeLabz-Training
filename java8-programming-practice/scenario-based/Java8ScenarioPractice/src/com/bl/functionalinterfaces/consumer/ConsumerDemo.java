package com.bl.functionalinterfaces.consumer;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {

        // 1. Print student details
        Consumer<String> printStudent = s -> System.out.println("Student: " + s);
        printStudent.accept("Alice");

        // 2. Log employee login
        Consumer<String> logLogin = name -> System.out.println(name + " logged in");
        logLogin.accept("Bob");

        // 3. Print order confirmation
        Consumer<Integer> orderConfirm = id -> System.out.println("Order confirmed: " + id);
        orderConfirm.accept(101);

        // 4. Display account balance
        Consumer<Double> showBalance = bal -> System.out.println("Balance: $" + bal);
        showBalance.accept(1250.50);

        // 5. Send notification
        Consumer<String> notifyUser = msg -> System.out.println("Notification: " + msg);
        notifyUser.accept("Your package has been shipped");
    }
}

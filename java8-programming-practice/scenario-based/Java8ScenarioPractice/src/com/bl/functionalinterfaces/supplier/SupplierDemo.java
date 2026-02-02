package com.bl.functionalinterfaces.supplier;
import java.util.function.Supplier;
import java.util.Random;
import java.time.LocalDateTime;

public class SupplierDemo {
    public static void main(String[] args) {

        Random rand = new Random();

        // 1. Generate OTP
        Supplier<Integer> otp = () -> 1000 + rand.nextInt(9000);
        System.out.println("OTP: " + otp.get());

        // 2. Random student ID
        Supplier<String> studentId = () -> "STU" + rand.nextInt(1000);
        System.out.println("Student ID: " + studentId.get());

        // 3. Current date-time
        Supplier<LocalDateTime> currentTime = LocalDateTime::now;
        System.out.println("Current Time: " + currentTime.get());

        // 4. Default welcome message
        Supplier<String> welcomeMsg = () -> "Welcome to our system!";
        System.out.println(welcomeMsg.get());

        // 5. Random discount coupon
        Supplier<String> coupon = () -> "DISC" + rand.nextInt(100);
        System.out.println("Coupon: " + coupon.get());
    }
}

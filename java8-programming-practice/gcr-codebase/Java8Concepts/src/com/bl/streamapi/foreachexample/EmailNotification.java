package com.bl.streamapi.foreachexample;
import java.util.*;

public class EmailNotification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> emails = new ArrayList<>();

        System.out.println("Enter emails (type 'end' to stop):");
        while (true) {
            String email = sc.nextLine();
            if (email.equalsIgnoreCase("end")) break;
            emails.add(email);
        }

        emails.forEach(email ->
                sendEmailNotification(email)
        );
    }

    private static void sendEmailNotification(String email) {
        System.out.println("Notification sent to: " + email);
    }
}

package com.bl.streamapi.foreachexample;
import java.util.*;

public class EventWelcome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> attendees = new ArrayList<>();

        System.out.println("Enter attendee names (type 'end' to stop):");
        while (true) {
            String name = sc.nextLine();
            if (name.equalsIgnoreCase("end")) break;
            attendees.add(name);
        }

        attendees.forEach(name ->
                System.out.println("Welcome " + name + "!")
        );
    }
}

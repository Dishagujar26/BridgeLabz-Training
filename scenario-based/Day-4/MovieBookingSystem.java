
/*
   14. Movie Ticket Booking App
   Ask users for movie type, seat type (gold/silver), and snacks.
   Use switch and if together.
   Loop through multiple customers.
   Clean structure and helpful variable names.
*/

import java.util.Scanner;

public class MovieBookingSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char continueBooking = '\u0000';

        System.out.println("-------------------------------------------");
        System.out.println(" WELCOME TO THE TICKET BOOKING APPLICATION ");
        System.out.println("-------------------------------------------");

        do {
			System.out.println("Enter Your Name");
			String name = sc.nextLine();
            // Movie selection
            System.out.println("\nWhich Movie Do You Want to Watch?");
            System.out.println("1. 500 Days of Summer");
            System.out.println("2. The Hangover");
            System.out.println("3. Notting Hill");
            System.out.println("4. The Holiday");

            int choice = sc.nextInt();
            String movieName = "";

            switch (choice) {
                case 1: movieName = "500 Days of Summer"; break;
                case 2: movieName = "The Hangover"; break;
                case 3: movieName = "Notting Hill"; break;
                case 4: movieName = "The Holiday"; break;
                default:
                    System.out.println("Invalid Movie Choice!");
                    continue;
            }

            // Mall selection
            System.out.println("\nSelect Mall:");
            System.out.println("1. DB City Mall");
            System.out.println("2. Aashima Mall");
            System.out.println("3. Capital Mall");
            System.out.println("4. Cinepolis");

            int mallChoice = sc.nextInt();
            String mallName = "";

            switch (mallChoice) {
                case 1: mallName = "DB City Mall"; break;
                case 2: mallName = "Aashima Mall"; break;
                case 3: mallName = "Capital Mall"; break;
                case 4: mallName = "Cinepolis"; break;
                default:
                    System.out.println("Invalid Mall Choice!");
                    continue;
            }

            // Time selection
            System.out.println("\nSelect Show Time:");
            System.out.println("1. Morning (11:30 AM)");
            System.out.println("2. Afternoon (3:30 PM)");
            System.out.println("3. Evening (7:30 PM)");

            int timeChoice = sc.nextInt();
            String showTime = "";

            switch (timeChoice) {
                case 1: showTime = "11:30 AM"; break;
                case 2: showTime = "3:30 PM"; break;
                case 3: showTime = "7:30 PM"; break;
                default:
                    System.out.println("Invalid Time Slot!");
                    continue;
            }

            // Booking summary
            System.out.println("\nBOOKING CONFIRMED");
            System.out.println("-------------------");
			System.out.println("Name : " + name);
            System.out.println("Movie : " + movieName);
            System.out.println("Mall  : " + mallName);
            System.out.println("Time  : " + showTime);

            // Continue?
            System.out.print("\nDo you want to book another ticket? (Y/N): ");
            continueBooking = sc.next().charAt(0);

        } while (continueBooking == 'Y' || continueBooking == 'y');

        System.out.println("\nThank you for using Movie Booking System!");
        sc.close();
    }
}


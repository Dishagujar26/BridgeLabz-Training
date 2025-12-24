import java.time.LocalDate;
import java.util.Scanner;

public class DateComparison {

    public static void main(String[] args) {
        // create a Scanne object
        Scanner sc = new Scanner(System.in);

        // Take first date
        System.out.println("Enter first date (yyyy-MM-dd):");
        LocalDate date1 = LocalDate.parse(sc.nextLine());

        // Take second date
        System.out.println("Enter second date (yyyy-MM-dd):");
        LocalDate date2 = LocalDate.parse(sc.nextLine());

        // Compare dates
        if (date1.isBefore(date2)) {
            System.out.println("First date is BEFORE second date");
        } 
        else if (date1.isAfter(date2)) {
            System.out.println("First date is AFTER second date");
        } 
        else {
            System.out.println("Both dates are SAME");
        }

        // close the Scanner object
        sc.close();
    }
}

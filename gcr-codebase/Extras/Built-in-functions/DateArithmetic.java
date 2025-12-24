import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {

    public static void main(String[] args) {
        // create a Scanne object
        Scanner sc = new Scanner(System.in);

        // get date input
        System.out.println("Enter date (yyyy-MM-dd):");
        LocalDate date = LocalDate.parse(sc.nextLine());

        LocalDate updatedDate = date.plusDays(7).plusMonths(1).plusYears(2);

        // Subtract 3 weeks
        updatedDate = updatedDate.minusWeeks(3);

        System.out.println("Final Date: " + updatedDate);

        // close the Scanner stream 
        sc.close();
    }
}

// Create NumberMultiples class to print all the multiples of a number below 100 using while loop
import java.util.Scanner;

public class NumberMultiples {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Get input value for number
        int number = sc.nextInt();

        // Check number is positive and less than 100
        if (number > 0 && number < 100) {
		
            int counter = 100;

            // Looping backward using while loop
            while (counter >= 1) {

                // Check if counter is a multiple of number
                if (counter % number == 0) {
                    System.out.println(counter);
                }
                counter--;
            }
        }

        // Close the Scanner Stream
        sc.close();
    }
}

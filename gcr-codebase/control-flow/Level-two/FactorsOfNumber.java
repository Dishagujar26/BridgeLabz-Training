// Create FactorsOfNumber class to compute the factors of a number taken as user input
import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
	    // Create a Scanner object 
        Scanner sc = new Scanner(System.in);

        // Get input value for number
        int number = sc.nextInt();

        // Check if number is positive integer
        if (number <= 0) {
            System.out.println("Please enter a positive integer");
        } else {
		    
			// Computing factors excluding the number itself
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }
		
		// Closing the Scanner Stream
		sc.close();
    }
}

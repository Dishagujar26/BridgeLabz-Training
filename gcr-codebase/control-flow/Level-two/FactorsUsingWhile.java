// Create FactorsUsingWhile class to compute factors of a number using while loop 
import java.util.Scanner;

public class FactorsUsingWhile {
    public static void main(String[] args) {
	    // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Get input value for number
        int number = sc.nextInt();

        // Check for positive integer
        if (number <= 0) {
            System.out.println("Please enter a positive integer");
        } 
		else {
            int counter = 1;
            while (counter < number) {
                if (number % counter == 0) {
                    System.out.println(counter);
                }
                counter++;
            }
        }
		
		// Closing the Scanner Stream
		sc.close();
    }
}

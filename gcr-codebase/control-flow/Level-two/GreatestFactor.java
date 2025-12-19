// Create GreatestFactor class to compute greatest factors of a number beside  itself
import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
	    // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Get input value for number
        int number = sc.nextInt();
		
		int greatestFactor  = 1;

        // Calculate the greatest factor
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }
		
		System.out.println("Greatest factor is " + greatestFactor);
		
		// Closing the Scanner Stream
		sc.close();
    }
}

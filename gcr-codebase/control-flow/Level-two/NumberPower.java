// Create NumberPower class to find the power of a number using while loop
import java.util.Scanner;

public class NumberPower {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Get input value for number and power
        int number = sc.nextInt();
        int power = sc.nextInt();

        // Initialized counter and result variable
        int result = 1;
        int counter = 1;
		
		// Calculating result using while loop
        while(counter <= power){
		    result *= number;
			counter++;
		}

        System.out.println(result);

        // Close the Scanner Stream
        sc.close();
    }
}



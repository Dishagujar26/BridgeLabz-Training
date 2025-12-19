// Create AbundantNumber class to check if a number is Abundant Number
import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
	    // Create a Scanner object 
        Scanner sc = new Scanner(System.in);

        // Get input value for number
        int number = sc.nextInt();
		    
		int sumOfFactors = 0;
		
	    //Computing factors excluding the number itself
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sumOfFactors += i;
            }
        }
       
		System.out.println(sumOfFactors > number ? "Abundant Number" : "Not Abundant Number");

		// Closing the Scanner Stream
		sc.close();
    }
}

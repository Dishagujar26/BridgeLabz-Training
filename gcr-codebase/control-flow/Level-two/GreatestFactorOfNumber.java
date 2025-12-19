// Create GreatestFactor class to compute greatest factors of a number beside  itself using while loop
import java.util.Scanner;

public class GreatestFactorOfNumber {
    public static void main(String[] args) {
	    // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Get input value for number
        int number = sc.nextInt();
		
		int greatestFactor  = 1;

        // Calculate the greatest factor using while loop
        int counter = number-1;
		while(counter >= 1){
		    if(number % counter == 0){
			    greatestFactor = counter;
				break;
			}
			counter--;
		}
		
		System.out.println("Greatest factor is " + greatestFactor);
		
		// Closing the Scanner Stream
		sc.close();
    }
}

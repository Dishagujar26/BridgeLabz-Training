// Create PrimeNumber class to check if the given number is prime or not
import java.util.Scanner;

public class PrimeNumber{
    public static void main(String[] args){
        // Create a Scanner object 
        Scanner sc = new Scanner(System.in);

        // Get input value for number
        int number = sc.nextInt();

        // Initialized a boolean variable 
        boolean isPrime = true;

        // Check for number greater than 1
        if (number > 1){

            // Looping to check for factors 
            for (int i = 2; i < number; i++){
                
				// No need to check further if factor found
                if (number % i == 0){
                    isPrime = false;
                    break; 
                }
            }
            if(isPrime){
                System.out.println(number + " is a Prime Number");
            } 
			else{
                System.out.println(number + " is not a Prime Number");
            }
        } 

        // Close the Scanner Stream
        sc.close();
    }
}




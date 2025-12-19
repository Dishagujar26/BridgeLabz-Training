import java.util.Scanner;

// Create SumOfNaturalNumbers Class to find sum of n natural number using for loop 

public class SumOfNaturalNumbers{  
	public static void main(String []args){
	    
		// Create a Scanner object 
        Scanner sc = new Scanner(System.in);
		
        // Get input value of number        		
		int number = sc.nextInt();
		
		int sum = 0;
		
		// Calculate sum using for loop
        for(int i=1; i<=number; i++){
            sum += i;
        }
		
		System.out.println("Sum of natural numbers "+ sum);
		
		// Closing the Scanner Stream
		sc.close();
         		
    }
}
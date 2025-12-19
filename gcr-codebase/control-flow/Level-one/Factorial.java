import java.util.Scanner;

// Create Factorial Class to compute factorial of an integer 

public class Factorial{  
	public static void main(String []args){
	    
		// Create a Scanner object 
        Scanner sc = new Scanner(System.in);
		
        // Get input value of number        		
		int number = sc.nextInt();
		
		int factorial = 1;
		
		// Check the entered number ia a positive integer
		if(number > 0){
		    
			// Calculate the factorial using for loop
			for(int i=2; i<=number; i++){
			    factorial *= i;
            }			
		}	
		
		System.out.println("Factorial of number " + number +" is "+ factorial);
		
		// Closing the Scanner Stream
		sc.close();
         		
    }
}
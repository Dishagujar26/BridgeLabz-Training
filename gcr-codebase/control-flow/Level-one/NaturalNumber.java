import java.util.Scanner;

// Create NaturalNumber Class to compute sum of n natural numbers
public class NaturalNumber{
    public static void main(String []args){
	    
		// Create a Scanner object 
	    Scanner sc = new Scanner(System.in);
		
		// Get three input value of number
		int x = sc.nextInt();
		
		// Check if number is a positive integer
		if(x > 0){
		    
			// Calculate the sum of n natural number using formula n * (n+1) / 2
		    int sum = x * (x + 1)/2;
			System.out.println("The sum of "+ x + " natural numbers is "+ sum);
		}
		else{
		    System.out.println("The number "+ x +" is not a natural number");
		}
		
		// Closing the Scanner Stream
		sc.close();
	}
	
}
			
		
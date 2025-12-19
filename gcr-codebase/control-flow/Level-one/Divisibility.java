import java.util.Scanner;

// Create Divisibility Class to check if a number is divisible by five
public class Divisibility{
    public static void main(String []args){
	    // Create a Scanner object 
	    Scanner sc = new Scanner(System.in);
		
		// Get input value for number
		int x  = sc.nextInt();
		
	    // Check if the number is divisible by five
		if(x%5 == 0){
		    System.out.println("Is the number "+ x +" divisible by 5? Yes" );
		}
		else{
	        System.out.println("Is the number "+ x +" divisible by 5? No" );
        }
		
		// Closing the Scanner Stream
		sc.close();
	}
}
		
		
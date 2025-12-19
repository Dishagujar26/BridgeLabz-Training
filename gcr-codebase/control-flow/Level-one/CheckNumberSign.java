import java.util.Scanner;

// Create CheckNumberSign Class to check whether a number is positive, negative, or zero.
public class CheckNumberSign{
    public static void main(String []args){
	    
		// Create a Scanner object 
	    Scanner sc = new Scanner(System.in);
		
		// Get input value of number
		int number = sc.nextInt();
		
		// Check if age is positive, negative or zero
		if(number == 0){
			System.out.println("Zero");
		}
		else if(number > 0){
			System.out.println("Positive");
		}
		else{
		    System.out.println("Negative");
        }
		
		// Closing the Scanner Stream
		sc.close();
	}
	
}
			
		
// Create a ArraySum class to take array elem until the user enters a 0 or a negative number 
// Create a MultiplicationResult class to display multiplication table from 6 to 9
import java.util.Scanner;

public class MultiplicationResult{
    public static void main(String []args){
	    
		// Create a Scanner object 
	    Scanner sc = new Scanner(System.in);
		
		// Declare an array of 10 elements
		int multiplicationResult[] = new int[10];
	    
        // Get input value for variable
        int number = sc.nextInt();
		
		// Initialize the array 
		for(int i=6; i<=9; i++){
			multiplicationResult[i] = number * i;
		}
		
		// Display the array 
		for(int i=6; i<=9; i++){
			System.out.println(number +" * "+ i +" = "+ multiplicationResult[i]);
		}

		// Closing the Scanner Stream
		sc.close();
	}
}
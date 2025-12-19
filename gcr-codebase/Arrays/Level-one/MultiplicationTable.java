// Create a MultiplicationTable class to display multiplication table
import java.util.Scanner;

public class MultiplicationTable{
    public static void main(String []args){
	    
		// Create a Scanner object 
	    Scanner sc = new Scanner(System.in);
		
		// Declare an array of 10 elements
		int arr[] = new int[10];
	    
        // Get input value for variable
        int number = sc.nextInt();
		
		// Initialize the array 
		for(int i=0; i<arr.length; i++){
			arr[i] = number * (i+1);
		}
		
		// Display the array 
		for(int i=0; i<arr.length; i++){
			System.out.println(number +" * "+(i+1)+" = "+ arr[i]);
		}

		// Closing the Scanner Stream
		sc.close();
	}
}
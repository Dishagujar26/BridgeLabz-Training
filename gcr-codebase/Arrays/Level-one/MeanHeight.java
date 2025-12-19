// Create a MeanHeight class to calculate the mean height of the football team
import java.util.Scanner;

public class MeanHeight{
    public static void main(String []args){
	    
		// Create a Scanner object 
	    Scanner sc = new Scanner(System.in);
		
		// Declare an array of 11 elements
		double arr[] = new double[11];
	    
        // Initialize the total variable 
        double total = 0.0;
		
        // Get input of array elements
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
        		
		// Calculate sum of array elem
		for(int i=0; i<arr.length; i++){
			total += arr[i];
		}
        
		System.out.println("Mean Height: "+ (total/11));
		
		// Closing the Scanner Stream
		sc.close();
	}
}
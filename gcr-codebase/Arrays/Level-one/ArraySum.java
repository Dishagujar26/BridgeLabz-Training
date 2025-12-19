// Create a ArraySum class to take array elem until the user enters a 0 or a negative number 
import java.util.Scanner;

public class ArraySum{
    public static void main(String []args){
	    
		// Create a Scanner object 
	    Scanner sc = new Scanner(System.in);
		
		// Declare an array of 10 elements
		double arr[] = new double[10];
	    
        // Initialize the total variable 
        double total = 0.0;
		
		// Initialize the index variable
		int index = 0;
		
		// While loop to get input for array 
		while(true){
		    int elem = sc.nextInt();
			if(elem == 0 || elem < 0){
			    break;
			}
			else if(index == 10){
			    break;
			}
			else{
			    arr[index] = elem;
				index++;
			}
		}
			
		// Calculate sum of array elem
		for(int i=0; i<arr.length; i++){
			total += arr[i];
		}
        
		System.out.println("Toatal: "+total);
		
		// Closing the Scanner Stream
		sc.close();
	}
}
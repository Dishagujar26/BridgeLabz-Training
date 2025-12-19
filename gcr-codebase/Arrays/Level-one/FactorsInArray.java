// Create a FactorsInArray class to store the factors of a number in an array
import java.util.Scanner;

public class FactorsInArray{
    public static void main(String []args){
	    
		// Create a Scanner object 
	    Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		int totalFactor = 0;
		
		// Compute total factors of a number
		for(int i=1; i<number; i++){
		    if(number % i == 0){
			    totalFactor++;
			}
		}
		
		// Declare an array 
		int arr[] = new int[totalFactor];
		
		int counter = 0;
		
        // Initialize the array
		for(int i=1; i<number; i++){
		    if(number % i == 0){
			    arr[counter] = i;
				counter++;
			}
		}
        		
		// Display array
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
        
		// Closing the Scanner Stream
		sc.close();
	}
}
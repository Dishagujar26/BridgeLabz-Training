
// Create a DigitLargestSecondLargest class to calculate the largest and second largest digit of a number
import java.util.Scanner;

public class DigitLargestSecondLargest {  
	public static void main(String []args){
        Scanner sc = new Scanner(System.in);
	    
		// Get the input value
		int number = sc.nextInt();
		
		// Declare the array 
		int maxDigit = 10;
		int []arr = new int[maxDigit];
		
		// Create index variable
		int index = 0;
		
		// compute the digits and store in array
		while(number > 0){
		    if(index == maxDigit){
		        break;
		    }
		    int digit = number % 10;
		    arr[index] = digit;
		    number /= 10;
		    index++;
		}
		
		// Define variables to store largest and second largest
		int largest = 0;
		int secondLargest = 0;
		
		// Find largest and second largest digit
		for(int i = 0; i < index; i++){
		    if(arr[i] > largest){
		        secondLargest = largest;
		        largest = arr[i];
		    }
		    else if(arr[i] > secondLargest && arr[i] != largest){
		        secondLargest = arr[i];
		    }
		}
		
		System.out.println("Largest digit " + largest);
		System.out.println("Second largest digit: " + secondLargest);
		
		// Closing the Scanner Stream
		sc.close();
    }
}

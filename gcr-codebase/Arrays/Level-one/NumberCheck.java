import java.util.Scanner;

public class NumberCheck{
    public static void main(String []args){
	    
		// Create a Scanner object 
	    Scanner sc = new Scanner(System.in);
		
		// Declare of five elements
		int arr[] = new int[5];
		
		// Input the elements 
		for(int i=0; i<arr.length; i++){
		    arr[i] = sc.nextInt();
		}
		
		// Check the number
		for(int i=0; i<arr.length; i++){
		    
			if(arr[i] == 0){
			    System.out.println("Zero");
			}
			else if(arr[i] > 0){
			    if(arr[i] % 2 == 0){
				    System.out.println("Even");
				}
				else{
				    System.out.println("Odd");
				}
			}
			else{
			    System.out.println("Negative");
		    }
		}
		
		// Check first and last element of array 
		if(arr[0] == arr[arr.length-1]){
		    System.out.println("Equal");
		}
		else if(arr[0] < arr[arr.length-1]){
		    System.out.println("First less than last");
	    }
		else{
		    System.out.println("First greater than last");
		}

		// Closing the Scanner Stream
		sc.close();
	}
}
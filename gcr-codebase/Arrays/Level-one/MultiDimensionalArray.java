// Create a MultiDimensionalArray class to create a 2D Array and Copy the 2D Array into a single dimension array

import java.util.Scanner;

public class MultiDimensionalArray{
    public static void main(String []args){
	    
	    Scanner sc = new Scanner(System.in);
		
		// Get input value for rows and cols
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		
		// Declare an 2D array 
		int [][]array1 = new int [rows][cols];
		
		// Initialize 2D array
		for(int i=0; i<rows; i++){
		    for(int j=0; j<cols; j++){
		        array1[i][j] = sc.nextInt();
		    }
		}
		
		// Declare an 1D array 
		int array2[] = new int[rows * cols];
		
		int index = 0;
		
        // Initialize 1D array
		for(int i=0; i<rows; i++){
		    for(int j=0; j<cols; j++){
		        array2[index] = array1[i][j];
				index++;
		    }
		}
		
		// Display array
		for(int i=0; i<array2.length; i++){
			System.out.print(array2[i]+" ");
		}
        
		// Closing the Scanner Stream
		sc.close();
	}
}
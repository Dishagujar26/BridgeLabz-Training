import java.util.Scanner;

// Create MultiplicationTable Class to compute multiplication table of a number

public class MultiplicationTable{  
	public static void main(String []args){
	    
		// Create a Scanner object 
        Scanner sc = new Scanner(System.in);
		
        // Get input value of number        		
		int number = sc.nextInt();
		
		for(int i=5; i<=9; i++){
		    System.out.println(number + " * " + i + " = " + (i*number));			   
		}
			
		// Closing the Scanner Stream
		sc.close();
         		
    }
}
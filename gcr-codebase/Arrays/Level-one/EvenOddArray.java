// Create a EvenOddArray class to create even odd array 
import java.util.Scanner;

public class EvenOddArray{
    public static void main(String []args){
	    
		// Create a Scanner object 
	    Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		// Check for natural number
		if(number <= 0){
		    System.out.println("Error");
			System.exit(0);
		}
		
		// Declare an array for even number
		int even[] = new int[number / 2 + 1];
		
		// Declare an array for odd number
		int odd[] = new int[number / 2 + 1];
	    
        // Initialize the evenIdx and oddIdx variable 
        int evenIdx = 0;
		int oddIdx = 0;
		
        // Initialize even and odd array
		for(int i=1; i<=number; i++){
			if(i % 2 == 0){
			    even[evenIdx] = i;
				evenIdx++;
			}
			else{
			    odd[oddIdx] = i;
				oddIdx++;
			}
		}
        		
		// Display even array
		
		for(int i=0; i<evenIdx; i++){
			System.out.print(even[i]+" ");
		}
		
		System.out.println();
		// Display odd array
		for(int i=0; i<oddIdx; i++){
			System.out.print(odd[i]+" ");
		}
        
		// Closing the Scanner Stream
		sc.close();
	}
}
// Create FriendsProgram class to calculate the tallest and the youngest among three friends
import java.util.Scanner;

public class FriendsProgram{  
	public static void main(String []args){
        Scanner sc = new Scanner(System.in);
		
		// Declare height array
        int []height = new int[3];
		
		// Declare age array
		int []age = new int[3];
		
		// Initialize height arrays
		for(int i=0; i<height.length; i++){
		    height[i] = sc.nextInt();
		}
		
		// Initialize age arrays
		for(int i=0; i<age.length; i++){
		    age[i] = sc.nextInt();
		}
		
		// Calculate the youngest 
		int smallest = Integer.MAX_VALUE;
		int smallestIdx = -1;
		
		for(int i=0;i<age.length;i++){
		    if(age[i] < smallest){
			    smallest = age[i];
				smallest = i;
			}
		}
		
		// Calculate the tallest 
		int largest = Integer.MIN_VALUE;
		int largestIdx = -1;
		
		for(int i=0;i<height.length;i++){
		    if(age[i] > largest){
			    largest = age[i];
				largestIdx = i;
			}
		}
		
		// Display youngest
		if(smallestIdx == 0){
		    System.out.println("Amar is the youngest");
		}
		else if(smallestIdx == 1){
		    System.out.println("Akbar is the youngest");
		}
		else{
		    System.out.println("Anthony  is the youngest");
		}
		
		// Display tallest
		if(largestIdx == 0){
		    System.out.println("Amar is the tallest");
		}
		else if(largestIdx == 1){
		    System.out.println("Akbar is the tallest");
		}
		else{
		    System.out.println("Anthony  is the tallest");
		}
		
		
		// Closing the Scanner Stream
		sc.close();
         		
    }
}






























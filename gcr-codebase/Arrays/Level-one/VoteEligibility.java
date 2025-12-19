// Create VoteEligibility class to check if students can vote or not
import java.util.Scanner;

public class VoteEligibility{
    public static void main(String []args){
	    
		// Create a Scanner object 
	    Scanner sc = new Scanner(System.in);
		int age[] = new int[10];
		
		// Input the elements 
		for(int i=0; i<10; i++){
		    age[i] = sc.nextInt();
		}
		
		// Check the age of student
		for(int i=0; i<10; i++){
		    if(age[i] < 0){
			    System.out.println("Invalid age");
			}
			else if(age[i] < 18){
			    System.out.println("The student with the age "+ age[i] +" cannot vote");
			}
			else{
			    System.out.println("The student with the age "+ age[i] +" can vote");
		    }
		}
		// Closing the Scanner Stream
		sc.close();
	}
}
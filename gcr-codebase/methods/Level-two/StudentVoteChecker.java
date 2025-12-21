import java.util.Scanner;

// Create a StudentVoteChecker class to validate if a student can vote or not 
public class StudentVoteChecker{
   
    // Method to check students age 
    public boolean canStudentVote(int age){	    
		
		if(age < 0){
		    return false;
		}
		else if(age >= 18){
		    return true;
		}
		else{
		    return true;
		}
        
	}
	
    public static void main(String[] args) {
		// Create a Scanner object
        Scanner sc = new Scanner(System.in);
		
		int []studentAge = new int[10];
		
		// Get the input values for array 
		for(int i=0;i<studentAge.length; i++){
		    studentAge[i] = sc.nextInt();
		}
		
		StudentVoteChecker studentVoteChecker = new StudentVoteChecker();
		
		// Check the student age
		for(int i=0;i<studentAge.length; i++){
		    System.out.println("The student with age "+ studentAge[i] +" can vote? "+ studentVoteChecker.canStudentVote(studentAge[i]));
		}
        
        // Close the Scanner object
        sc.close(); 
	}   
     
}
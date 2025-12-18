
// Creating a class with name PenDistribution indicating the purpose which is to calculate how many pens each student will get after equal distribution.

public class PenDistribution{
    public static void main(String []args){
	
	    //create an int variables to store the total number of pens
	    int Pen = 14;
		
	    //create an int variables to store the total number of student
	    int Student = 3;
		
		//create an int variable to store remaining pen
		int pensNotDistributed  = 14%3;
		
		//create an int variable storing total pens distributed to each student
		int pensDistributed  = Pen/Student;
		
		System.out.println("The Pen Per Student is " + pensDistributed +" and the remaining pen not distributed is "+ pensNotDistributed);
	}
}
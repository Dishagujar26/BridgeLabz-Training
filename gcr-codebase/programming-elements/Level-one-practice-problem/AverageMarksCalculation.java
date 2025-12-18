
// Creating a class with name AverageMarksCalculation indicating the purpose which is to calculate the average percent mark in PCM

public class AverageMarksCalculation{
    public static void main(String []args){
	
	    //create three int variables and assign the values
	    int mathsMarks = 94;
		int physicsMarks = 95;
		int chemistryMarks = 96;
		
		// Create an double variable averageMarks and calculate the average percent mark in PCM
		double averageMarks = (mathsMarks + physicsMarks + chemistryMarks)/3;
		
		System.out.println("Sam's average mark in PCM is "+ averageMarks);
	}
}
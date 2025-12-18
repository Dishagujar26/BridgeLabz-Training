
// Creating a class with name AgeCalculation indicating the purpose which is to calculate the current age of Harry.

public class AgeCalculation{
    public static void main(String []args){
	    String name = "Harry";
		int birthYear = 2000;
		int currentYear = 2024;
		
		// Create an int variable age and calculate the current age of Harry
		int age = currentYear-birthYear;
		
		System.out.println("The age of "+ name + " in "+ currentYear +" is " + age);
	}
}
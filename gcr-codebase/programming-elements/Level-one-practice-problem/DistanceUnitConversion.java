
// Creating a class with name DistanceUnitConversion indicating the purpose which is to convert the distance in kilometers to miles.

public class DistanceUnitConversion{
    public static void main(String []args){
	
	    //create a double variables to store the value of distance in kilometers
	    double kilometersDistance = 10.8;
		
		// Create a double variable milesDistance and calculate the distance in miles
		double milesDistance = kilometersDistance * 1.6;
		
		System.out.println("The distance "+ kilometersDistance +" km in miles is " + milesDistance);
	}
}
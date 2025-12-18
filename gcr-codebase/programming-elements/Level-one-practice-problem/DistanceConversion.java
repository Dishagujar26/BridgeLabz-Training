import java.util.Scanner;

// Creat DistanceConversion class to convert distance from feet to yards and miles

public class DistanceConversion{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance in feet:");
        double distanceInFeet = sc.nextDouble();

        // Create a variable to convert feet into yards using formule(1 yard = 3 feet)
        double distanceInYards = distanceInFeet / 3.0;

        // Create a variable to convert yards into miles using formula 
        // 1 mile = 1760 yards, 1 yard = 3 feet -> 1 mile = 1760 * 3 feet = 5280 feet
        double distanceInMiles = distanceInFeet / 5280.0;

        System.out.println("The distance in yards is " + distanceInYards +" while the distance in miles is " + distanceInMiles);
    }
}
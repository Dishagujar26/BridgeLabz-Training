import java.util.Scanner;

//creating a class with a name HeightUnitConversion to convert height from centimeters to feet and inches
public class HeightUnitConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your height in centimeters");

        // create a variable to store height in centimeters
        double heightInCentimeters = sc.nextDouble();

        // create a variable to convert centimeters to inches (1 inch = 2.54 cm)
        double heightInInches = heightInCentimeters / 2.54;

        // create a variable to convert inches to feet (1 foot = 12 inches)
        double heightInFeet = heightInInches / 12;

        System.out.println("Your Height in cm is "+ heightInCentimeters + " while in feet is "+ heightInFeet +" and inches is "+heightInInches);
    }
}

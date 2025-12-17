import java.util.Scanner;

// Creating class with name KilometersToMiles indicating the purpose is to convert distance in kilometers into miles
public class KilometersToMiles {

    public static void main(String[] args) {

        // Create Scanner object sc to read input from keyboard
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Distance Value: ");

        // Create a double variable base and store value entered by user
        double kiloDistance = sc.nextDouble();

        // Create a variable and use the formula Kilometers * 0.621371
        double milesDistance = kiloDistance * 0.621371;

        // Display the calculated Distance  
        System.out.println("The distance in miles is " + milesDistance);
    }
}
import java.util.Scanner;

// Creating class with name CylinderVolume indicating the purpose is to calculate volume of a cylinder. 
public class CylinderVolume {

    public static void main(String[] args) {

        // Create Scanner object sc to read input from keyboard
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of the cylinder: ");

        double radius = sc.nextDouble();

        System.out.print("Enter height of the cylinder: ");

        // Create a double variable height and store value entered by user
        double height = sc.nextDouble();

        // Create a double variable volume and calculate volume using formula pi * r * r * h
        double volume = 3.14 * (radius * radius) * height;

        // Display the calculated volume of the cylinder
        System.out.println("Volume of the cylinder is: " + volume);
    }
}

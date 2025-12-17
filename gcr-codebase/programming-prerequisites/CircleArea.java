import java.util.Scanner;

// Creating class with name CircleArea indicating the purpose is to calculate area of a circle. 
public class CircleArea {

    public static void main(String[] args) {

        // Create Scanner object sc to read input from keyboard
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of the circle: ");

        // Create a double variable radius and store value entered by user
        double radius = sc.nextDouble();

        // Create a double variable area and calculate area using formula pi * r * r
        double area = 3.14 * (radius * radius);

        // Display the calculated area of the circle
        System.out.println("Area of the circle is: " + area);
    }
}

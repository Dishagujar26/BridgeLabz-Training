import java.util.Scanner;

// Creating class with name RectanglePerimeter indicating the purpose is to calculate Perimeter of Rectangle
public class RectanglePerimeter {

    public static void main(String[] args) {

        // Create Scanner object sc to read input from keyboard
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");

        // Create a int variable length and store value entered by user
        int length = sc.nextInt();

        System.out.print("Enter width: ");

        // Create a int variable width and store value entered by user
        int width = sc.nextInt();

        // Create a int variable perimeter and calculate using formula Perimeter = 2 * (length + width)
        int perimeter = 2 * (length + width);

        // Display the calculated perimeter 
        System.out.println("Perimeter of Rectangle is: " + perimeter);
    }
}
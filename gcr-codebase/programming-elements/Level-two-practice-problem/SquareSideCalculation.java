import java.util.Scanner;

//creating a class name SquareSideCalculation to calculate the side of a square from its perimeter
public class SquareSideCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the perimeter of the square");
        double perimeter = sc.nextDouble();

        //create a variable for alculating side of the square (side = perimeter / 4)
        double side = perimeter / 4;

        System.out.println("The length of the side is " + side +" whose perimeter is "+ perimeter);
    }
}

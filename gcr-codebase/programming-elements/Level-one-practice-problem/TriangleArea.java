import java.util.Scanner;

// creating a class name TriangleArea to calculate area of a triangle in square centimeters and square inches
public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base and height of the triangle in centimeters");

        double base = sc.nextDouble();
        double height = sc.nextDouble();

        //create a variable to calculate area in square centimeters using formula 1/2 * base * height
        double areaInSqCm = (1.0 / 2.0) * base * height;

        //create a variable to calculate area in square inches (1 inch = 2.54 cm)  
        double areaInSqInches = areaInSqCm / (2.54 * 2.54);

        System.out.println("Area of triangle in square centimeters is " + areaInSqCm +" and in square inches is " + areaInSqInches);
    }
}

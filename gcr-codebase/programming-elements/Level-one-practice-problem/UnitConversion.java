import java.util.Scanner;

// creating a class with name UnitConversion to convert distance from kilometers to miles

public class UnitConversion {
    public static void main(String[] args) {
        //Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the distance in kilometers");
        //create a variable to store distance in kilometers
        double km = sc.nextDouble();

        //create a variable to store distance converted in miles 
        double miles = km * 0.621371;

        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
    }
}


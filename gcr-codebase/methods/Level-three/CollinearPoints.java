import java.util.Scanner;
//create CollinearPoints class to find the 3 points that are collinear using the slope formulae and area of triangle formulae
public class CollinearPoints {

    // method to check collinearity using formula
    public static boolean isCollinearUsingSlope(
            int x1, int y1, int x2, int y2, int x3, int y3) {

            // slopes
            double slopeAB = (double)(y2 - y1)/(x2 - x1);
            double slopeBC = (double)(y3 - y2)/(x3 - x2);
            double slopeAC = (double)(y3 - y1)/(x3 - x1);

        return (slopeAB == slopeBC) && (slopeBC == slopeAC);
    }

    // Method to check collinearity using area of triangle formula
    public static boolean isCollinearUsingArea(
            int x1, int y1, int x2, int y2, int x3, int y3) {

            double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
            return area == 0;
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        // Check using slope method
        System.out.println("Collinear using slope formula: " + isCollinearUsingSlope(x1, y1, x2, y2, x3, y3));

        // Check using area method
        System.out.println("Collinear using area formula: " + isCollinearUsingArea(x1, y1, x2, y2, x3, y3));

        // close scanner object
        sc.close();
    }
}

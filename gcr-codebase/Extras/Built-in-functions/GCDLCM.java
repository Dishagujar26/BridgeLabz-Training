import java.util.Scanner;
// creata GCDLCM class to calculate gcd and lcm of numbers
public class GCDLCM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();

        System.out.println("Enter second number:");
        int b = sc.nextInt();

        // Calculate GCD and LCM
        int gcd = findGCD(a,b);
        int lcm = findLCM(a,b);

        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);

        // close Scanner stream
        sc.close();
    }

    // Method to find GCD
    public static int findGCD(int a, int b) {
        if (b==0) {
            return a;
        }
        return findGCD(b,a%b);
    }

    // Method to find LCM
    public static int findLCM(int a,int b) {
        return (a*b)/findGCD(a,b);
    }
}

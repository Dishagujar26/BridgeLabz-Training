import java.util.Scanner;

//creating a class with a name MaximumHandshakes to calculate maximum number of handshakes among N number of students

public class MaximumHandshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int numberOfStudents = sc.nextInt();

        //create a variable for calculating maximum handshakes using combination formula nC2 = n*(n-1)/2
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.println("The maximum number of handshakes among "+ numberOfStudents + " students is " + maxHandshakes);
    }
}

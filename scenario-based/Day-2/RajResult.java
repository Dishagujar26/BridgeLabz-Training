import java.util.Scanner;

public class RajResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter marks of subject " + i + ": ");
            sum += sc.nextInt();
        }

        int average = sum / 5;
        char grade;

        switch (average / 10) {
            case 10:
            case 9: grade = 'A'; break;
            case 8: grade = 'B'; break;
            case 7: grade = 'C'; break;
            case 6: grade = 'D'; break;
            default: grade = 'F';
        }

        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    }
}

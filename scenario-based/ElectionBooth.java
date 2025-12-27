import java.util.Scanner;

public class ElectionBooth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int candidate1 = 0, candidate2 = 0, vote3 = 0;

        while (true) {
            System.out.print("Enter age (-1 to exit): ");
            int age = sc.nextInt();

            if (age == -1) break;

            if (age >= 18) {
                System.out.print("Vote (1/2/3): ");
                int vote = sc.nextInt();

                if (vote == 1) vote1++;
                else if (vote == 2) vote2++;
                else if (vote == 3) vote3++;
                else System.out.println("Invalid vote");
            } else {
                System.out.println("Not eligible to vote");
            }
        }

        System.out.println("Results:");
        System.out.println("Candidate 1: " + vote1);
        System.out.println("Candidate 2: " + vote2);
        System.out.println("Candidate 3: " + vote3);
    }
}

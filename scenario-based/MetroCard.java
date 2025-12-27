import java.util.Scanner;

public class MetroCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 200;

        while (balance > 0) {
            System.out.print("Enter distance (0 to exit): ");
            int distance = sc.nextInt();

            if (distance == 0) break;

            double fare = (distance <= 5) ? 10 :
                          (distance <= 15) ? 20 : 30;

            if (balance >= fare) {
                balance -= fare;
                System.out.println("Fare deducted: " + fare);
                System.out.println("Remaining balance: " + balance);
            } else {
                System.out.println("Insufficient balance");
                break;
            }
        }
    }
}

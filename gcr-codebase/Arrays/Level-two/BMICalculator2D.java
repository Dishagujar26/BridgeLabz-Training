import java.util.Scanner;
// Create a BMICalculator2D class tp calculates BMI and health status of multiple people using a 2D

public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        // 2D array to store weight, height, BMI
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        // Input weight and height 
        for (int i = 0; i < number; i++) {
            do {
                personData[i][0] = sc.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Weight must be positive");
                }
            } while (personData[i][0] <= 0);

            do {
                personData[i][1] = sc.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Height must be positive.");
                }
            } while (personData[i][1] <= 0);
        }

        // Calculate BMI and check weight status
        for (int i = 0; i<number; i++) {
            double weight = personData[i][0];
            double height = personData[i][1];
            double bmi = weight / (height * height);

            personData[i][2] = bmi; 

            // check bmi status
            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        
        System.out.println("\nResults:");
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) + " -- Height: " + personData[i][1] + " m, Weight: " + personData[i][0] +" kg, BMI: " + personData[i][2] +", Status: " + weightStatus[i]);
        }

        // Close scanner
        sc.close();
    }
}

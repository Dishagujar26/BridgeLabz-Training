import java.util.Scanner;
// Create a BMICalculator2D class to calculate BMI and health status of 10 people using a 2D array

public class BMICalculator2D {

    // Method to calculate BMI for all persons and store in 2D array
    public static void calculateBMI(double[][] personData) {
        for (int i = 0; i < personData.length; i++) {
            double weight = personData[i][0];
            double heightCm = personData[i][1];

            // Convert height from cm to meters
            double heightMeter = heightCm / 100;

            // BMI formula
            double bmi = weight / (heightMeter * heightMeter);

            personData[i][2] = bmi;
        }
    }

    // Method to determine BMI status for all persons
    public static String[] getBMIStatus(double[][] personData) {
        String[] status = new String[personData.length];

        for (int i = 0; i < personData.length; i++) {
            double bmi = personData[i][2];

            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {

        // Scanner object for input
        Scanner sc = new Scanner(System.in);

        double[][] personData = new double[10][3];

        // Take input for weight and height
        for (int i = 0; i < 10; i++) {
            do {
                personData[i][0] = sc.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Weight must be positive");
                }
            } while (personData[i][0] <= 0);

            do {
                personData[i][1] = sc.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Height must be positive");
                }
            } while (personData[i][1] <= 0);
        }

        // Calculate BMI
        calculateBMI(personData);

        // Get BMI status
        String[] bmiStatus = getBMIStatus(personData);

        // Display results
        System.out.println("\nResults:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) +" -- Weight: " + personData[i][0] +" kg, Height: " + personData[i][1] +" cm, BMI: " + personData[i][2] +", Status: " + bmiStatus[i]);
        }

        // Close scanner object
        sc.close();
    }
}

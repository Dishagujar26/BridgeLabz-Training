import java.util.Scanner;
// Create a BMICalculator2D class tp calculates BMI and health status of multiple people using a 2D

public class BMICalculator2D {

    // Create a Method to find the BMI and status of every person
    public static String[][] calculateBMIAndStatus(double[][] personData){
        String[][] result = new String[personData.length][4];

        for (int i=0; i<personData.length; i++) {

            double weight = personData[i][0];
            double heightCm = personData[i][1];

            // convert cm to meter
            double heightMeter = heightCm / 100;

            double bmi = weight/(heightMeter*heightMeter);

            String status;
            if (bmi <= 18.4) {
                status = "Underweight";
            } else if (bmi <= 24.9) {
                status = "Normal";
            } else if (bmi <= 39.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            result[i][0] = String.valueOf(heightCm);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }
        return result;
    }

    // Create a Method that takes the 2D array of height and weight as parameters
    public static String[][] processBMI(double[][] personData) {
        return calculateBMIAndStatus(personData);
    }

    // Create a method to display the 2D string array in a tabular format
    public static void displayResult(String[][] data) {

        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\t\tStatus");

        for (int i = 0; i<data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1] + "\t\t" +data[i][2] + "\t\t" +data[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = 10;

        // 2D array to store weight and height
        double[][] personData = new double[number][2];

        // Input weight and height 
        for (int i=0; i<number; i++) {

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

        String[][] result = processBMI(personData);

        displayResult(result);

        // Close scanner stream
        sc.close();
    }
}

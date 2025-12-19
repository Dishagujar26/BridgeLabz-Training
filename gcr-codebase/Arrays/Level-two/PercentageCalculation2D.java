import java.util.Scanner;
// Create PercentageCalculation2D class to calculates percentage and grade of students using a 2D array for marks.

public class PercentageCalculation2D{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberStudents = sc.nextInt();

        // 2D array to store marks for each student 
        double[][] marks = new double[numberStudents][3];

        // Arrays to store percentage and grade for each student
        double[] percentages = new double[numberStudents];
        String[] grades = new String[numberStudents];

        // Input for each student
        for (int i=0; i<numberStudents; i++) {
            for (int j=0; j<3; j++) {
                double mark;
                do {
                    mark = sc.nextDouble();
                    if (mark < 0) {
                        System.out.println("Marks must be positive.");
                    }
                } while (mark < 0);

                marks[i][j] = mark; 
            }
        }

        // Calculate percentage and grade for each student
        for (int i = 0; i<numberStudents; i++) {
            double total = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = total/3; 

            // check grade based on percentage
            if(percentages[i] > 80){
                grades[i] = "A";
            }
			else if (percentages[i] >= 70){
                grades[i] = "B";
            }
			else if (percentages[i] >= 60){
                grades[i] = "C";
            }
			else if (percentages[i] >= 50){
                grades[i] = "D";
            }
			else if (percentages[i] >= 40){
                grades[i] = "E";
            }
			else {
                grades[i] = "R";
            }
        }
		
        for (int i = 0; i<numberStudents; i++){
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Physics: " + marks[i][0] + ", Chemistry: " + marks[i][1] + ", Maths: " + marks[i][2]);
            System.out.println("Percentage: " + percentages[i] + "%, Grade: " + grades[i]);
            System.out.println();
        }

        // Close the scanner
        sc.close();
    }
}

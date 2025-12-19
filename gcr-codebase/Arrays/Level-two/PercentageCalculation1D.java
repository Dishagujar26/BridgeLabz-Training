import java.util.Scanner;
// Create PercentageCalculation1D class computes student percentage and grade using only 1D arrays

public class PercentageCalculation1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numStudents = sc.nextInt();

        // 1D array to store marks for all students 
        double[] marks = new double[numStudents * 3];

        // Arrays to store percentage and grade for each student
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];

        // Input marks for each student
        for (int i=0; i<numStudents; i++) {
            for (int j=0; j<3; j++) {
                double mark;
                do {
                    mark = sc.nextDouble();
                    if (mark < 0){
                        System.out.println("Marks must be positive");
                    }
                } while(mark < 0);
                marks[i*3+j] = mark; 
            }
        }

        // Calculate percentage and grade for each student
        for (int i = 0; i<numStudents; i++) {
            double total = marks[i*3] + marks[i*3+ 1] + marks[i*3 + 2]; 
            percentages[i] = total/3;

            // Grade based on percentage
            if (percentages[i] > 80){
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

        System.out.println("\nStudent Results:");
        for (int i = 0; i<numStudents; i++) {
            System.out.println("Student " + (i+1) + ":");
            System.out.println("Physics: " + marks[i * 3] + ", Chemistry: " + marks[i * 3 + 1] + ", Maths: " + marks[i * 3 + 2]);
            System.out.println("Percentage: " + percentages[i] + "%, Grade: " + grades[i]);
            System.out.println();
        }

        // Close scanner
        sc.close();
    }
}

import java.util.Scanner;

// class StudentGradeSystem calculate total, average and percentage of student marks
public class StudentGradeSystem {

    // Method to generate random 2-digit PCM marks
    public static int[][] generatePCMScores(int students) {
        int[][] scores = new int[students][3];

        for (int i = 0; i < students; i++) 
		{
            scores[i][0] = (int)(Math.random() * 90) + 10; 
            scores[i][1] = (int)(Math.random() * 90) + 10; 
            scores[i][2] = (int)(Math.random() * 90) + 10; 
        }
        return scores;
    }

    // Method to calculate total, average and percentage
    public static double[][] calculateResults(int[][] scores) {
        double[][] result = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total/3.0;
            double percentage = (total/300.0)*100;

            result[i][0] = total;
            result[i][1] = Math.round(average*100.0)/100.0;
            result[i][2] = Math.round(percentage*100.0)/100.0;
        }
        return result;
    }

    // Method to calculate grade 
    public static String[][] calculateGrades(double[][] result) {
        String[][] grades = new String[result.length][1];

        for (int i = 0; i < result.length; i++) {
            double percentage = result[i][2];

            if (percentage >= 80)
                grades[i][0] = "A";
            else if (percentage >= 70)
                grades[i][0] = "B";
            else if (percentage >= 60)
                grades[i][0] = "C";
            else if (percentage >= 50)
                grades[i][0] = "D";
            else if (percentage >= 40)
                grades[i][0] = "E";
            else
                grades[i][0] = "R";
        }
        return grades;
    }

    // Method to display scorecard
    public static void displayScoreCard(int[][] scores,double[][] result,String[][] grades) {
        System.out.println("\nID\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.println(
                (i + 1) + "\t" +
                scores[i][0] + "\t" +
                scores[i][1] + "\t" +
                scores[i][2] + "\t" +
                (int)result[i][0] + "\t" +
                result[i][1] + "\t" +
                result[i][2] + "\t" +
                grades[i][0]
            );
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        int[][] scores = generatePCMScores(students);
        double[][] results = calculateResults(scores);
        String[][] grades = calculateGrades(results);

        displayScoreCard(scores, results, grades);

        // close scanner stream
        sc.close();
    }
}

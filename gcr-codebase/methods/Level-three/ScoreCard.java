import java.util.Scanner;

public class ScoreCard {

    // Method to generate random 2-digit PCM scores
    public static int[][] generateScores(int students) {
        int[][] scores = new int[students][3]; // 0-Phy, 1-Chem, 2-Math

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = (int)(Math.random() * 90) + 10; 
            }
        }
        return scores;
    }

    // Method to calculate total, avg, and percentage
    public static double[][] calculateResults(int[][] scores) {
        double[][] result = new double[scores.length][3]; 

        for (int i = 0; i<scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // round to 2 digits
            result[i][0] = total;
            result[i][1] = Math.round(average * 100.0)/100.0;
            result[i][2] = Math.round(percentage * 100.0)/100.0;
        }
        return result;
    }

    // Method to determine grade based on percentage
    public static String getGrade(double percentage) {
        if (percentage >= 80) {
		    return "A";
		}
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else if (percentage >= 40) return "E";
        else return "R";
    }

    // Method to display scorecard
    public static void displayScoreCard(int[][] scores, double[][] results) {
        System.out.println("ID\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");

        for (int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "\t");
            System.out.print(scores[i][0] + "\t");
            System.out.print(scores[i][1] + "\t");
            System.out.print(scores[i][2] + "\t");
            System.out.print(results[i][0] + "\t");
            System.out.print(results[i][1] + "\t");
            System.out.print(results[i][2] + "\t");
            System.out.println(getGrade(results[i][2]));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for number of students
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        int[][] scores = ScoreCard.generateScores(students);
        double[][] results = ScoreCard.calculateResults(scores);

       ScoreCard.displayScoreCard(scores, results);
    }
}

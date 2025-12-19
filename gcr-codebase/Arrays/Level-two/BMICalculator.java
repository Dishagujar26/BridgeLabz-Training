import java.util.Scanner;
// Create class BMICalculator to calculates BMI and weight status for multiple persons using separate arrays.
public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take input for number of persons
        int number = sc.nextInt();
        
        double[] height = new double[number];
        double[] weight = new double[number];
        double[] bmi = new double[number];
        String[] status = new String[number];
        
        // input for weight and height 
        for(int i=0; i<number; i++) {
            weight[i] = sc.nextDouble();
           
        }
		
		for(int i=0; i<number; i++) {
           
            height[i] = sc.nextDouble();
        }
        
        // Calculate BMI and  check weight status
        for(int i = 0; i < number; i++) {
            bmi[i] = weight[i]/(height[i] * height[i]); 
            
            // check weight status 
            if(bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } 
			else if(bmi[i] <= 24.9) {
                status[i] = "Normal";
            } 
			else if(bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } 
			else {
                status[i] = "Obese";
            }
        }
        
        // Display the results
        for(int i = 0; i < number; i++) {
            System.out.println("Height: " + height[i]+" Weight: " +weight[i]+" BMI: "+ bmi[i]+ " Status: " + status[i]);
        }
        
        // Closing the Scanner Stream
        sc.close();
    }
}

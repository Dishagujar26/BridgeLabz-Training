
import java.util.Scanner;
import java.util.Arrays;

public class ZaraBonus{
    public static void main(String []args){
	    Scanner sc = new Scanner(System.in);
		
		// Declare an array for salary
		double []salary = new double[10];
		
		// Declare an array for year
		int []year = new int[10];
		
		// Declare an array for salary after bonus
		double []newSalary = new double[10];
		
		// Declare an array for bonus
		double []bonus = new double[10];
		
		double totalBonus = 0.0;
		double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;
		
		// Initialize the salary  
        for(int i=0;i<10;i++){
            double elem = sc.nextDouble();
            if(elem < 0.0){
                System.out.println("Enter valid salary");
				i--;
				continue;
			}
			salary[i] = elem;
		}
		
		// Initialize the year  
        for(int i=0;i<10;i++){
            int elem = sc.nextInt();
            if(elem < 0){
                System.out.println("Enter valid year");
				i--;
				continue;
			}
			year[i] = elem;
		}
		
		for(int i=0;i<10;i++){
		    if (year[i] > 5) {
                bonus[i] = 0.05;          
            }
			else{
                bonus[i] = 0.02;          
            }
			
			// Calculate new salary
            newSalary[i] = salary[i] + (salary[i] * bonus[i]);
			
			// Calculate totals
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
            totalBonus += salary[i] * bonus[i];
		}
				
		// Display array
		System.out.println("Total Old Salary " + totalOldSalary +" Total New Salary " + totalNewSalary +" Total Bonus " + totalBonus);

		// Closing the Scanner Stream
		sc.close();
	}
}


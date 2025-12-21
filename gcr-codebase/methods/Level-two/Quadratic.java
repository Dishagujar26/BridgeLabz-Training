import java.util.Scanner;
// Create a Quadratic  class to find the roots of the equation ax2+ bx + c.

public class Quadratic  {

    // Method to calculate roots 
    public static double[] calculateRoots(double delta, int a,int b){
        if(delta > 0){
		    double root1 = (- b + Math.sqrt(delta))/(2 * a);
		    double root2 = (- b - Math.sqrt(delta))/(2 * a);
		
		    return new double[]{root1,root2};
	    }
		else if(delta == 0){
		    
			double root = -b/(2*a);
		    return new double[]{root};
		}
		else{
		    
		    return new double[]{};
		}
    }

    // Method to calculate delta
    public static double calculateDelta(int a ,int b,int c) {
        return Math.pow(b,2) + 4 * a * c;		
    }

    public static void main(String[] args) {

        // Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Take input value
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
		
	    double delta = Quadratic.calculateDelta(a,b,c);
		
	    double[]roots = Quadratic.calculateRoots(delta,a,b);
		
		if(delta > 0){
		    System.out.println("Roots are: "+ roots[0] + " " +roots[1]);
	    }
		else if(delta == 0){
		    
			System.out.println("Roots are: "+ roots[0] );
		}
		else{
		    
		    System.out.println("No roots");
		}

        // Close scanner object
        sc.close();
    }
}
import java.util.Scanner;

// Create FactorOperations class to perform various tasks using the factors array
public class FactorOperations{

    // method to find factors of a number and return array
    public static int[] findFactors(int number){
        
		// get the count of factors
        int count = 0;
        for(int i = 1; i <= number; i++){
            if(number%i == 0){
                count++;
            }
        }

        // create array to store factors
        int[] factors = new int[count];

        // store factors
        int index = 0;
        for(int i = 1; i <= number; i++){
            if(number % i == 0){
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }

    // Method to find the greatest factor
    public static int greatestFactor(int[] factors){
        int greatest = Integer.MIN_VALUE;

        for(int factor:factors){
            if(factor>greatest){
                greatest = factor;
            }
        }
        return greatest;
    }

    // Method to find the sum of factors
    public static int sumOfFactors(int[] factors){
        int sum = 0;
        for(int factor : factors){
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of factors
    public static long productOfFactors(int[] factors){
        long product = 1;
        for(int factor : factors){
            product *= factor;
        }
        return product;
    }

    // Method to find the product of the cube of the factors
    public static double productOfCubeOfFactors(int[] factors){
        double product = 1;
        for(int factor : factors){
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    public static void main(String[] args){

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int[] factors = FactorUtility.findFactors(number);

        System.out.print("Factors: ");
        for(int elem : factors){
            System.out.print(elem + " ");
        }

        System.out.println("\nGreatest Factor: " + FactorOperations.greatestFactor(factors));
        System.out.println("Sum of Factors: " + FactorOperations.sumOfFactors(factors));
        System.out.println("Product of Factors: " + FactorOperations.productOfFactors(factors));
        System.out.println("Product of Cube of Factors: " + FactorOperations.productOfCubeOfFactors(factors));

        // close scanner object
        sc.close();
    }
}
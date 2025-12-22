import java.util.Scanner;

public class NumberChecker {
    
	// method to find the count of digits in the number 
	public static int findCount(int number){
	    int count = 0;
		while(number > 0){
		    count++;
			number /= 10;
		}
		return count;
	}
	
	// method to Store the digits of the number in a digits array
    public static int[] createDigitsArray(int number, int count){
        int []digits = new int[count];
        
        // store digits in correct order (first digit at index 0)
        for(int i = count - 1; i >= 0; i--){
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }
	
	// method to check duck number
	public static boolean duckNumberCheck(int []digits){
		
		for(int i=0;i<digits.length; i++){
		    if(digits[i] == 0){
			    return false;
			}
		}
		return true;
	}
	
	// Method to check Armstrong number using digits array
    public static boolean isArmstrong(int[] digits) {
        int sum = 0;
        int n = digits.length;
        for (int i = 0; i < n; i++) {
            sum += Math.pow(digits[i], n);
        }

        // original number from digits array
        int original = 0;
        for (int i = 0; i < n; i++) {
            original = original * 10 + digits[i];
        }

        return sum == original;
    }
	
	// Method to find largest and second largest
    public static int[] findLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : digits) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return new int[]{largest,secondLargest};
    }
	
	// Method to find smallest and second smallest
    public static int[] findSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : digits) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        return new int[]{smallest,secondSmallest};
    }
	
	public static void main(String []args){
	
	    // Create a Scanner object
	    Scanner sc = new Scanner(System.in);
	    
		int number = sc.nextInt();
		int count = NumberChecker.findCount(number);
		System.out.println("Count of digits "+ count);
		
	    int []digits = NumberChecker.createDigitsArray(number,count);
        System.out.println("Is it a duck number "+ NumberChecker.duckNumberCheck(digits));
        System.out.println("Is it a armstrong number "+ NumberChecker.isArmstrong(digits));
		
		int largest[] = NumberChecker.findLargest(digits);
        System.out.println("Is it a largest: "+ largest[0] +" second largest " + largest[1]);
		
		int smallest[] = NumberChecker.findSmallest(digits);
        System.out.println("Is it a smallest: "+ smallest[0] +" second smallest " + smallest[1]);
		
		// close the scanner object
		sc.close();
	}
}
import java.util.Scanner;

public class ModifiedDigitProgram{  
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
        // Get the input value
        int number = sc.nextInt();
       
        
		int maxDigit = 10;
		// Declare the array 
        int []arr = new int[maxDigit];
		
        // Create index variable
        int index = 0;
        
        // compute the digits and store in array
        while(number > 0){
            // If index reaches maxDigit increase array size by 10
            if(index == arr.length){
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                for(int j = 0; j < arr.length; j++){
                    temp[j] = arr[j];
                }
				
				// reassigning 
                arr = temp; 
            }

            int digit = number % 10;
            arr[index] = digit;
            number /= 10;
            index++;
        }
        
        // Create variables largest and second largest
        int largest = 0;
        int secondLargest = 0;
        
        // Find largest and second largest digit
        for(int i = 0; i < index; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        
        System.out.println("Largest digit " + largest);
        System.out.println("Second largest digit " + secondLargest);
        
        // Closing the Scanner Stream
        sc.close();
    }
}

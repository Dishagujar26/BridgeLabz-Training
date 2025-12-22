import java.util.Scanner;

// Create OTPGeneration class to generate a six-digit OTP number and validate
public class OTPGeneration{

    // method to generate 6 digit random number
	public static int generateOtpNumber(){
	    return (int)(Math.random() * 900000) + 100000;
    }

    // Method to check the uniquness of the otp array
    public static boolean isUnique(int[] otp){
        for(int i = 0; i < otp.length; i++){
            for(int j = i + 1; j < otp.length; j++){
                if(otp[i] == otp[j]){
                    return false; 
                }
            }
        }
        return true; 
    }

    public static void main(String[] args){

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // declare the otp array
        int []otp = new int[10];
 
        // Initialize the otp array 
        for(int i=0; i<otp.length;i++){
            otp[i] = OTPGeneration.generateOtpNumber();
        }

        // display the otp array 
        for(int num : otp){
            System.out.println(num);
        }
        
		if(OTPGeneration.isUnique(otp)){
		    System.out.println("Unique");
		}
		else{
	        System.out.println("Not Unique");
		}
		
        // close scanner object
        sc.close();
    }
}
import java.util.Scanner;

// Create SpringSeason Class to check whether its a spring season or not 
public class SpringSeason {
   
    // Method to check the season 
    public boolean checkSeason(int month, int day){
	     
        // Check if the date falls in Spring
        if ((month == 3 && day >= 20 && day <= 31) ||   
            (month == 4 && day >= 1 && day <= 30)  ||   
            (month == 5 && day >= 1 && day <= 31)  ||   
            (month == 6 && day >= 1 && day <= 20)) {    
            return true;
        } 
		else {
            return false;
        }
    }
   
    public static void main(String[] args) {
		// Take input for month and day
		int month = Integer.parseInt(args[0]);
		int day = Integer.parseInt(args[1]); 
		
		SpringSeason springSeason = new SpringSeason();
		
		
		
		// Call the method
		if(springSeason.checkSeason(month,day)){
            System.out.println("It is a spring season");
        }
        else{
            System.out.println("It is not a spring season");
        }			
        
	}   
     
}
// Create SpringSeason Class to check if a date falls in Spring Season

public class SpringSeason{
    public static void main(String[] args){
        
        // Get input value of month and day from command line argument
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
        
        // Check if the date falls in Spring
        if ((month == 3 && day >= 20 && day <= 31) ||   
            (month == 4 && day >= 1 && day <= 30)  ||   
            (month == 5 && day >= 1 && day <= 31)  ||   
            (month == 6 && day >= 1 && day <= 20)) {    
            System.out.println("Spring Season");
        } 
		else {
            System.out.println("Not a Spring Season");
        }
    }
}

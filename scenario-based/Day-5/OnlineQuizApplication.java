/*
17. Online Quiz Application
Ask 5 questions (MCQs) from a user.
● Use arrays and for-loop.
● Record score.
● Switch for answer checking. Apply clear indentation and structured layout.
*/

import java.util.Scanner;

public class OnlineQuizApplication{
    public static void main(String[]args){
	    Scanner sc = new Scanner(System.in);
		    
			int totalCorrect = 0;
			// array to store user answers
			String []userAnswers = new String[5];
		
			System.out.println("\nQuestion 1.What's the capital of India?");
			System.out.println("\nA.Mumbai\nB.New Delhi\nC.Gujrat\nD.Agra");
			userAnswers[0] = sc.next().toLowerCase();
			
			switch (userAnswers[0]) {
                case "b":
                    System.out.println("Correct!");
                    totalCorrect++;
                    break;
                case "a":
                case "c":
                case "d":
                    System.out.println("Wrong!");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
			
			System.out.println("\nQuestion 2.What's the financial capital of India?");
			System.out.println("\nA.Mumbai\nB.New Delhi\nC.Gujrat\nD.Banglore");
			userAnswers[1] = sc.next().toLowerCase();
			
			switch (userAnswers[1]){
                case "a":
                    System.out.println("Correct!");
                    totalCorrect++;
                    break;
				case "b":
                case "c":
                case "d":
                    System.out.println("Wrong!");
                    break;
                default:
                    System.out.println("Invalid choice, Please Try Again!");
            }
			    
			System.out.println("\nQuestion 3.Where is the Taj Mahal located?");
			System.out.println("\nA.Mumbai\nB.New Delhi\nC.Agra\nD.Banglore");
			userAnswers[2] = sc.next().toLowerCase();
			
			switch(userAnswers[2]){					
				case "c":
				    System.out.println("Correct!");
					totalCorrect++;
					break;
					
				case "a":
				case "b":
				case "d":
				    System.out.println("Wrong!");
					break;	
				default:
				    System.out.println("Invalid Choice, Please Try Again!");
					
			}
			
			System.out.println("\nQuestion 4.What is famously known as the silicon valley of India? ");
			System.out.println("\nA.Mumbai\nB.New Delhi\nC.Agra\nD.Banglore");
			userAnswers[3] = sc.next().toLowerCase();
			
			switch(userAnswers[3]){
			    case "a":
				case "b":
				case "c":
				    System.out.println("Wrong!");
					break;
					
				case "d":
				    System.out.println("Correct!");
				    totalCorrect++;
					break;
					
				default:
				    System.out.println("Invalid Choice, Please Try Again!");
					
			}
			
			System.out.println("\nQuestion 5. Which type of forests are most common in India? ");
			System.out.println("\nA.Equatorial evergreen\nB.Conifers and pines\nC.Savanna and desert vegetation\nD.Tropical deciduous");
			userAnswers[4] = sc.next().toLowerCase();
			
			switch(userAnswers[4]){
			    case "a":
				case "b":
				case "c":
				    System.out.println("Wrong!");
					break;
				case "d":
				    System.out.println("Correct!");
				    totalCorrect++;
					break;
					
				default:
				    System.out.println("Invalid Choice, Please Try Again!");
					
			}
			
			System.out.println("\nYour Score - "+ totalCorrect +"/5");
		
            //close scanner stream
       		sc.close();
			
		}
		
}
			    
		
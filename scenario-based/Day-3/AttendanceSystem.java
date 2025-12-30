/*
  9. School Bus Attendance System 
  Track 10 students' presence.
  Use for-each loop on names.
  Ask "Present or Absent?"
  Print total present and absent counts.
*/

import java.util.Scanner;

public class AttendanceSystem{
    
	public static void main(String []args){
	    Scanner sc = new Scanner(System.in);
		
		//store 10 students name
		String [] studentNames = {"Chandler Bing","Rachel Green","Joey Tribiani","Monica Geller","Ross Geller","Andy Bernard","Micheal Scott","Dwight k Shruwt","Jim Helpert","Erin"};
		String [] attendance = new String[10];
		
		// loop to take attendance
		for(int i=0;i<10;i++){
		    System.out.println("Is "+ studentNames[i]+" Present or Absent? ");
			attendance[i] = sc.next();
		}
		
		int totalPresent = 0;
		int totalAbsent = 0;
		
		// count total presents and absents
		for(int i=0;i<10;i++){
		    if(attendance[i].equalsIgnoreCase("present")){
			    totalPresent++;
			}
			else{
			    totalAbsent++;
			}
		}
		
		System.out.println("Total Student Present Today "+ totalPresent);
		System.out.println("Total Student Absent Today "+ totalAbsent);
		
	}
}
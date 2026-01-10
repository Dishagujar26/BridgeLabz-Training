package com.bl.day7.travelitineraryplanner;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Select the type of trip\n1.International Trip\n2.Domestic Trip ");
       int choice = sc.nextInt();
       sc.nextLine();
       Trip p;
       if(choice == 1) {
    	   System.out.println("Enter destination name: ");
    	   String name = sc.nextLine();
    	   System.out.println("Enter budget: ");
    	   double budget = sc.nextDouble();
           sc.nextLine();

    	   System.out.println("Enter trip duration: ");
    	   int duration = sc.nextInt();
    	   System.out.println("Enter the way of transport");
    	   String transportName = sc.nextLine();
    	   System.out.println("Enter the cost of transport: ");
    	   double transportCost= sc.nextDouble();
           sc.nextLine();

    	   
    	   Transport t = new Transport(transportName,transportCost);
    	   
    	   System.out.println("Enter the hotel name");
    	   String hotelName = sc.nextLine();
    	   System.out.println("Enter the cost of hotel: ");
    	   double hotelCost= sc.nextDouble();
           sc.nextLine();

    	   Hotel h = new Hotel(hotelName,hotelCost);
    	   
    	   System.out.println("Enter the activity name");
    	   String activityName = sc.nextLine();
    	   System.out.println("Enter the cost of activity: ");
    	   double activityCost= sc.nextDouble();
           sc.nextLine();

    	   Activity a  = new Activity(activityName,activityCost);

           p = new InternationalTrip(name,budget,duration,t,h,a);
           p.book();
           p.cancel();
       }
       else if(choice == 2) {
    	   System.out.println("Enter destination name: ");
    	   String name = sc.nextLine();
    	   System.out.println("Enter budget: ");
    	   double budget = sc.nextDouble();
           sc.nextLine();

    	   System.out.println("Enter trip duration: ");
    	   int duration = sc.nextInt();
           sc.nextLine();

    	   System.out.println("Enter the way of transport");
    	   String transportName = sc.nextLine();
    	   System.out.println("Enter the cost of transport: ");
    	   double transportCost= sc.nextDouble();
           sc.nextLine();
    	   
    	   Transport t = new Transport(transportName,transportCost);
    	   
    	   System.out.println("Enter the hotel name");
    	   String hotelName = sc.nextLine();
    	   System.out.println("Enter the cost of hotel: ");
    	   double hotelCost= sc.nextDouble();
           sc.nextLine();

    	   Hotel h = new Hotel(hotelName,hotelCost);
    	   
    	   System.out.println("Enter the activity name");
    	   String activityName = sc.nextLine();
    	   System.out.println("Enter the cost of activity: ");
    	   double activityCost= sc.nextDouble();
           sc.nextLine();

    	   
    	   Activity a  = new Activity(activityName,activityCost);

           p = new InternationalTrip(name,budget,duration,t,h,a);
           p.book();
           p.cancel();
       }
    	   
	}
}

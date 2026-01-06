package com.bl.sorting;
import java.util.Arrays;
import java.util.Scanner;

//O(n) - best average, worst O(n2) space O(1)

public class BubbleSort {
	
	 public static int[] sort(int[]studentMarks){
	        boolean flag = false;
	        for(int i=0;i<studentMarks.length;i++){
	            for(int j=1;j<=studentMarks.length-i-1;j++){
	                if(studentMarks[j] < studentMarks[j-1]){
	                    swap(studentMarks,j-1,j);
	                    flag = true;
	                }
	            }
	            if(!flag){
	                break;
	            }
	        }
	        return studentMarks;
	    }
	    public static int[] swap(int []arr,int start,int end){
	        int temp=arr[start];
	        arr[start]=arr[end];
	        arr[end]=temp;
	        return arr;
	    }
	
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int []studentMarks=new int[n];
        System.out.println("Enter the numbers");
        for(int i=0;i<n;i++) {
            studentMarks[i] = sc.nextInt();
        }
        
        int []result=sort(studentMarks);
        System.out.println(Arrays.toString(result));

    }
   
}

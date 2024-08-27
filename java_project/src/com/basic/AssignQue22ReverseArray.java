package com.basic;
//•	WAP to reverse an array of integer values. 

import java.util.Scanner;

public class AssignQue22ReverseArray {
public static void main(String[] args) {
	
	int []arr= {1,2,3,4,5};
	   System.out.println("integer values in reverse order");
	   
	   for(int i=arr.length-1;i>=0; i--) {
		   System.out.print(arr[i]+" ");
	   }
	
}
}

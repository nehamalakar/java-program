/*
 * take an array as input from the user .search for a given number x and print the index at which it occurs.
 */





package com.basic;

import java.util.Scanner;

public class array {
public static void main(String[] args) {
	int[]a= {1,2,3,4,5};
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size of array:");
	int size=sc.nextInt();
	int numbers[]=new int[size];
	
	for(int i=0; i<=5; i++) {
		numbers[i]=sc.nextInt();
		
}
	int x=sc.nextInt();
	
	for(int i=0; i<=numbers.length; i++) {
		if(numbers[i]==x) {
		System.out.println("x found at index:" +i);
	}
	
}
}	
}

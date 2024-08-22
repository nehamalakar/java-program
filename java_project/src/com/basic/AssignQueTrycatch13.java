package com.basic;

import java.util.Scanner;

//•	WAP to demonstrate try catch block. 

public class AssignQueTrycatch13 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	try {
		int a,b;
		System.err.println("enter a: ");
		a=sc.nextInt();
		System.out.println("enter b:" );
		b=sc.nextInt();
		
		System.out.println("div is:"+(a/b));
		
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	
	System.out.println("this code is writen by neha");
	
	}
}

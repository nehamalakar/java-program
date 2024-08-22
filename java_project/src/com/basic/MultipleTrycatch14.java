package com.basic;
//•	WAP to demonstrate multiple catch blocks 

public class MultipleTrycatch14 {
	
public static void main(String[] args) {
	try {
		//int[]a=new int[2];
		//a[9]=5;
		
		//int a=10/0;
		
		String st="Neha";
		st.charAt(56);
		
	}catch (ArithmeticException e) {
		System.out.println("Arithmetic Exception handled");
		
	}catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("ArrayIndexoutofBounds exception handled");
		
	}catch (Exception e) {
		System.out.println("Exception got handled");
	}
	
}
}

package com.basic;
//•	WAP to concatenate a given string to the end of another string. 
public class AssignQueString2 {
public static void main(String[] args) {
	String s1="Hello";
	String s2="World";
	
	System.out.println("string 1: "+s1);
	System.out.println("string 2: "+s2);
	String s3=s1.concat(s2);
	
	System.out.println("The concatenate string: "+s3);
}
}

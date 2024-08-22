package com.basic;
//A
//AB
//ABC
//ABCD
//ABCDE
//ABCDEF
public class PatternDemoAB2 {
public static void main(String[] args) {
	char i,j,A,F;
	for (i='A'; i<='F';i++) {
		for (j='A';j<=i;j++) {
			System.out.print(j);
		}
		System.out.println();
	}
}
}

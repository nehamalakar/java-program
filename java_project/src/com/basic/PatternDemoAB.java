package com.basic;

import java.util.Iterator;

//A
//BB
//CCC
//DDDD
//EEEEE
public class PatternDemoAB {
public static void main(String[] args) {
	char i,j,A,E;
	for( i='A';i<='E'; i++) {
		for(j='A'; j<=i; j++) {
			System.out.print(i);
		}
		System.out.println();
	}
}
}

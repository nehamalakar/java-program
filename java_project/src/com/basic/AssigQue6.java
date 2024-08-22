package com.basic;
// W.A.J.P for create Fibonacci Series.
// 0..1..1..2..3..5..8..13..last 2 digit add it is called fibonacci series  ex. 5+8=13
public class AssigQue6 {
public static void main(String[] args) {
	int term=8, a=0,b=1,c;
	for(int i=1;i<=term;i++) {
		System.out.println(a+" ");  
		c=a+b;  
		a=b;    
		b=c;    
		
	}
}
}

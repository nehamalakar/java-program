package com.basic;
//•	WAP to sum values of an array. 


public class AssignQue9ArrauSum {
public static void main(String[] args) {
int[]a=new int[] {6,2,20,4,5};
int sum=0;

for(int i=0; i<a.length; i++) {
	sum =sum+a[i];
	
}
System.out.println("sum of values of an array: "+sum);
}
}

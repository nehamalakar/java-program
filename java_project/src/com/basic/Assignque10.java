package com.basic;

import java.util.Iterator;

//•	WAP to calculate the average value of array elements. 

public class Assignque10 {
public static void main(String[] args) {
	int[]a= {10,20,30,40,50};
	int length=a.length;
	int sum=0;
	 for(int i=0; i<length; i++) {
		sum=sum+a[i];
	 }
	 System.out.println("sum of elements of array: "+sum);
	 float average=sum/length;
	 System.out.println("average of elements:"+average);
	 
}
}

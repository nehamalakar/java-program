package com.basic;
//•	WAP to find the maximum and minimum value of an array. 

public class AssignQue12 {
public static void main(String[] args) {
	 int a[]= {50,30,40,20,100};
	 int max=a[0];
	 for(int i=1; i<a.length; i++) {
		 if(a[i]>max) {
			 max=a[i];
		 }
	 }
	 System.out.println("maximum value array is:"+max);
	 
	 int min=a[0];
	 for(int i=1; i<a.length; i++) {
		 if(a[i]<min) {
			 min=a[i];
			 
		 }
	 }
	 System.out.println("minimum value array is:"+min);
}
}

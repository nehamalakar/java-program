package com.basic;
//WAP to Copy one array into another

public class AssignQue21CopyArray {
public static void main(String[] args) {
	//initialize first array
	int arr1[]=new int[] {1,2,3};
	
	//create another array arr2 with same size as arr1 
	int arr2[]=new int[arr1.length];
	
	// copying all elements of arr1 to arr2
	for(int i=0; i<arr1.length; i++) {
		arr2[i]=arr1[i];
		
	}
	//copy one array into another array
	System.out.println("Display elements of second array");
	for(int i=0; i<arr2.length; i++) {
		System.out.print(arr2[i] +" ");
	}
}
}

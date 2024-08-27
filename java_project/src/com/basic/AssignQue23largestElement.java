package com.basic;
//•	WAP to find the second largest element in an array. 

public class AssignQue23largestElement {
public static void main(String[] args) {
	int arr[]= {2,5,8,6,7,9,10};
	int max=arr[0];
	int secondMax=arr[1];
	
	for(int i:arr) {
		if(i>max) {
			secondMax=max;
			max=i;
			
		}else if (i>secondMax){
			secondMax=i;
			
		}
			
		}
	System.out.println("Second largest number:"+secondMax);
	}
	
}




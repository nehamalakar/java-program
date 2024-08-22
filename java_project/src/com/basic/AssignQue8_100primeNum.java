package com.basic;


import java.util.*;

//•	WAP to compute the sum of the first 100 prime numbers. 
//(2+3+5+7+......+100)

public class AssignQue8_100primeNum {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the first and last number");
	int num1=sc.nextInt();//1
	int num2=sc.nextInt();//100
	
	int sum=0;
	
	for(int i=num1; i<=num2; i++) {
		int n=i;
		int temp=0;
		int a=2;
		
	
	while(a<=(n/2)) {
		if((n%a)==0){
			temp++;
			break;
			
		}
		a++;
    	  
      }
	if(temp==0 && i !=1) {
		sum=sum+i;
	}
      System.out.println("sum of first 100 prime numbers: "+sum);
}
}
}
package com.basic;
 
//Ramesh’s basic salary is input through the keyboard. His 
//dearness allowance is 40% of basic salary, and house rent 
//allowance is 20% of basic salary. Write a program to calculate 
//his gross salary. 
//

public class CalcDemo {
public static void main(String[] args) {
	double basic_salary=10000,da,hra,gross_salary;
	
	da=0.4*basic_salary;
	hra=0.2*basic_salary ;
	System.out.println("D A is :"+da);
	System.out.println("h r is:"+hra);

	System.out.println("sum is :"+(da+hra+basic_salary));
}
}

package com.basic;
//•	W.A.J.P. which will ask the user to enter his/her marks (out of 100).
//Define a method that will
//display grades according to the marks entered as below:

import java.awt.GraphicsDevice;
import java.util.Scanner;

//Marks 	Grade 
//91-100 	AA 
//81-90 	AB 
//71-80 	BB 
//61-70 	BC 
//51-60 	CD 
//41-50 	DD 
//<=40 	Fail 

public class AssignQue26Marksheet {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter total marks out of 100");
	int totalmarks=sc.nextInt();
	
	if (totalmarks>90||totalmarks==100) {
		System.out.println("Grade==AA !");
		
	}else if(totalmarks>80||totalmarks==90) {
		System.out.println("Grade==AB !");
	}else if (totalmarks>70||totalmarks==80) {
		System.out.println("Grade==BB !");
		
	}else if(totalmarks>60||totalmarks==70) {
		System.out.println("Grade==BC !");
	}else if(totalmarks>50||totalmarks==60) {
		System.out.println("Grade==CD !");
	}else if(totalmarks>40||totalmarks==50) {
		System.out.println("Grade==DD !");
	}else {
		System.out.println("FAIL");
	}
	}
	
	
}


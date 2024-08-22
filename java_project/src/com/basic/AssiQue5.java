package com.basic;
// W.A.J.P to check given number is Armstrong or not?
//num=134
public class AssiQue5 {
public static void main(String[] args) {
	int n=134,arm=0,rem,c;
	c=n;
	while (n>0)
	{
		rem=n%10;
		arm=(rem*rem*rem)+arm;
		n=n/10;
		
	}
	if(c==arm)
		System.out.println("armstrong number");

     else 
	System.out.println("is not an armstrong number");

	

	}

	}


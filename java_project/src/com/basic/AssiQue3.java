package com.basic;
// W.A.J.P to find factorial for Given Number.
//6!=6*5*4*3*2*1
public class AssiQue3 {
public static void main(String[] args) {
	int i=1,num=6,fact=1;
	for (i=1;i<=num;i++) {
		fact=fact*i;
	}
	System.out.println("factorial of "+num+"is:"+fact);
}
}

//1
//22
//333
//4444

//  *
// * * *
//* * * * *
// * * *
//  * 
package com.basic;

public class AssiQue8 {
public static void main(String[] args) {
	for(int i=1; i<=4; i++) {
		for(int j=1; j<=i; j++) {
			System.out.print(i);
		}
		System.out.println();
	}
	
	for(int i=1; i<=3; i++){
		for(int j=3; j>=i; j--) {
			System.out.print(" ");
		}
		for(int k=1; k<=2*i-1; k++) {
			System.out.print("*");
		}
		System.out.println();
	
	}
	for(int i=2; i>=1; i--){
		for(int j=3; j>=i; j--) {
			System.out.print(" ");
		}
		for(int k=1; k<=(2*i-1); k++) {
			System.out.print("*");
		}
		System.out.println();
	
	}
}
}

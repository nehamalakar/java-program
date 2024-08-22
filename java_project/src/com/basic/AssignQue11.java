package com.basic;
//•	WAP to find the index of an array element. 

public class AssignQue11 {
public static void main(String[] args) {
	String[] colors= {"red","green","blue","orange"};
	int index=0;
	for(int i=0;i<colors.length;i++) {
		if(colors[i]=="green") {
			index=i;
		}
	}
	System.out.println("index:"+index);
}
}

package com.basic;
//•	WAP to update specific array element by given element. 

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class AssignQue20SpecifyArray {
public static void main(String[] args) {
	ArrayList<String>fruits=new ArrayList<String>();
	fruits.add("Mango");
	fruits.add("Apple");
	fruits.add("Banana");
	fruits.add("Orange");
	
	
	
		System.out.println(fruits);
		fruits.set(2, "pineapple");
		System.out.println("after update: "+fruits);
	}
}


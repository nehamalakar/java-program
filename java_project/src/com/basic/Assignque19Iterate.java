package com.basic;

import java.util.ArrayList;

//•	WAP to iterate through all elements in an array list.

public class Assignque19Iterate {
public static void main(String[] args) {
	ArrayList<String>fruits=new ArrayList<String>();
	fruits.add("Mango");
	fruits.add("Apple");
	fruits.add("Banana");
	fruits.add("Orange");
	System.out.println("fruits: "+fruits);
	System.out.println("using for loop");
	
	
	for(String fruit:fruits) {
		System.out.println(fruit);
	}
}
}

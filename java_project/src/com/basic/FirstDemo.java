package com.basic;

import javax.management.ValueExp;

public class FirstDemo {
	public static void main(String[] args) {
//		variable declare
//		syn:[datatype][variable name];
//		variable initialize
//		syn:[datatype]variable name]=[value]
		
		
		int i1= 2147483647;
		long l1=878799859431l;
		char ch='T';
		byte b1=127;
		boolean bb=true;//1bit
		
		
		float f1=545.546f;
		double d1=54959.5465;
				
				System.out.println("integer value is:"+i1);
                System.out.println("long value is:"+l1);
                System.out.println("Char Value is:"+ch);
		        System.out.println("byte value is:"+b1);
		        System.out.println("Boolean Valueis:"+bb);
		        System.out.println("float value is:"+f1);
		        System.out.println("double value is:"+d1);
				
	
	System.out.println("size of integer is:"+Integer.BYTES);
	System.out.println("size of long is: "+Long.BYTES);
    System.out.println("size of char is: "+Character.BYTES);
    System.out.println("size of byte is: "+Byte.BYTES);
    System.out.println("size of float is: "+Float.BYTES);
    System.out.println("size of double is: "+Double.BYTES);

	}
}

package com.basic;
/*
 * /*
*type conversion:
	convert from one form to primitive datatype to another
	
	int 4
	float 4
	long  8
	double  8
	boolean  1 BIT
	byte    1
	Charater   2 
	
	implicit conversion automatic convert
	from small size datatype to bigger size
	explicit conversion
	from bigger size datatype to small datatype
	
 */
public class TypeConversion {
public static void main(String[]args) {
	int i1=10; //4
	long l1=i1; //8
			System.out.println("implicit conversion is :"+l1);
	
	int i2=(int)l1;//4
	System.out.println("explicit conversion is :"+i2);
	
	char ch='A';
	int i3=ch;
	
	System.out.println("implicit conversion is:"+i3);
	
	int i4=256;//-128 -127 -126 to 127
			byte b1=(byte)i4;// -128 -127 -126 -125 to 127
	System.out.println("Byte is:"+b1);
	
	
	
}
}


		 
		 
		 
 
         
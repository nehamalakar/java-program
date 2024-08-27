package com.basic;
//•	W.A.J.P. Create an abstract class 'Parent' with a method 'message'. 
//It has two subclasses each having a method with the same name 'message' 
//that prints "This is first subclass"
//and "This is second subclass" respectively. 
//Call the methods 'message' by creating an object for each subclass. 


abstract class parent{
	public abstract void message() ;
		
	}
	  class firstsubclass extends parent{
		  public void message() {
			  System.out.println("this is first subclass");
		  }
		
	}
	 class  secondsubclass extends parent{
		 public void message() {
			 System.out.println("this is second subclass");
			
		}
	 }
	
		
	
	

public class AssinQue24 {
public static void main(String[] args) {
	firstsubclass f1=new firstsubclass();
	f1.message();
	
	secondsubclass f2=new secondsubclass();
	f2.message();
		
}
}

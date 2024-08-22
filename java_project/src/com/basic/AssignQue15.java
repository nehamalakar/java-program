package com.basic;
//	//•	WAP to create one thread by extending Thread class in another 
 

class First extends Thread{
	
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("First Thread is...."+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("First Thread is completed...");
		
	}
}
public class AssignQue15 {
public static void main(String[] args) {
	First first=new First();
	first.start();
	
	for(int i=1; i<=5; i++) {
		System.out.println("main Thread is...."+i);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	System.out.println("main Thread is completed...");
	
}
}

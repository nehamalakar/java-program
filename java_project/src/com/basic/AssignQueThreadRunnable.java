package com.basic;
//WAP to create one thread by implementing Runnable interface in Class.
class Second implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1; i<=5; i++) {
			System.out.println("Second Thread is...."+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Second Thread is completed...");
		
	}
	
}
public interface AssignQueThreadRunnable {
public static void main(String[] args) {
	Second s1=new Second();
	Thread t1=new Thread(s1);
	
	
	t1.setName("Neha");
	t1.setPriority(Thread.MAX_PRIORITY);
	System.out.println(t1);
	t1.start();
	System.out.println("is second thread alive..."+t1.isAlive());
	for(int i=1; i<=5; i++) {
		System.out.println("main Thread is...."+i);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	System.out.println("is second thread alive..."+t1.isAlive());

	System.out.println("main Thread is completed...");
	

}
}

package com.basic;

import java.security.interfaces.RSAKey;
import java.util.Scanner;

class NehaException extends Exception{
	double amount;
	public NehaException (double amount) {
		this.amount=amount;
	}
}
class ATM{
	double balance=0;

	public void deposit(double amount) {
		
		balance=balance+amount;
		System.out.println(balance+"rs deposited");
	}
	public void withdraw(double amount)throws NehaException {
		if(amount<balance) {
		balance=balance-amount;
		System.out.println(amount+"rs withdrawn from the account your remaining balance is "+balance);
	}else {
		double needs=amount-balance;//5000-2000=3000
		throw new NehaException(needs);
	}
}
}
public class UserDefinedException {
public static void main(String[] args) {
	double amount;
	ATM atm=new ATM();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the amount to be deposited");
	amount=sc.nextDouble();
	atm.deposit(amount);
	
	System.out.println("enter the amount withdrawn ");
	amount=sc.nextDouble();
	try {
		atm.withdraw(amount);
	} catch (NehaException e) {
		
		e.printStackTrace();
		System.out.println("you need "+e.amount+"rs more to withdraw "+amount);
	}
}
}

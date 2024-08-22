package com.basic;

public class SumDemo {
public static void main(String[] args) {
	public class Jarvis {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Hello, I am Jarvis. How can I assist you today?");
	        while (true) {
	            String command = scanner.nextLine();
	            if (command.equalsIgnoreCase("hello")) {
	                System.out.println("Hello, how are you?");
	            } else if (command.equalsIgnoreCase("date")) {
	                System.out.println("Today's date is July 24, 2024");
	            } else if (command.equalsIgnoreCase("time")) {
	                System.out.println("I'm not able to provide real-time information. However, I can suggest ways for you to find out the current time.");
	            } else if (command.equalsIgnoreCase("exit")) {
	                System.out.println("Goodbye!");
	                break;
	            } else {
	                System.out.println("I didn't understand your command. Please try again.");
	            }
	        }
	        scanner.close();
	    }
	}
}
}

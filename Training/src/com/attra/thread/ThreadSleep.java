package com.attra.thread;

public class ThreadSleep {

	public static void main(String[] args) {
		long st = System.currentTimeMillis();
		System.out.println("Starting the Program .....");
	
	try {
		Thread.sleep(2000);
	
		long et = System.currentTimeMillis();
		System.out.println("The Thread name is : "+Thread.currentThread().getName());
		Thread.currentThread().setName("Being Thread");
		System.out.println("The current Thread name is : "+Thread.currentThread().getName());
		System.out.println("The Thread priority is : "+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(10);
		System.out.println("The current Thread priority is : "+Thread.currentThread().getPriority());
		System.out.println("Completed the program in "+ (et-st) + " milliseconds");
	
	} catch (InterruptedException e) {
		System.err.println("Error while operaating the thread");
		e.printStackTrace();
	}
		
	}

}

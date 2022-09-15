package com.attra.thread;


public class DaemonThread {

	public static void main(String[] args) {

		System.out.println("Starting the program .....");
		// long st = System.currentTimeMillis();
		PrintTableByMultipleThreads thread1 = new PrintTableByMultipleThreads(3);
		System.out.println("The thread executing this task is " + Thread.currentThread().getName());
		System.out.println("Thread1 State is : " + thread1.getState());
		System.out.println("Is Thread1 a Daemon Thread : " + thread1.isDaemon());
		System.out.println("Is Main Thread a Daemon Thread : " + Thread.currentThread().isDaemon());

		thread1.setDaemon(true);
		System.out.println("Is Thread1 a Daemon Thread : " + thread1.isDaemon());
		System.out.println("Is Main Thread a Daemon Thread : " + Thread.currentThread().isDaemon());
		System.out.println("The program is fully executed .....");
	
	
	}
}

package com.attra.thread;

public class ThreadJoin {

	public static void main(String[] args) {

		System.out.println("Starting a program .....");
		long st = System.currentTimeMillis();
		PrintTableByMultipleThreads thread1 = new PrintTableByMultipleThreads(3);
		System.out.println("The thread executing this task is " + Thread.currentThread().getName());
		System.out.println("Thread1 State is : "+thread1.getState());
		thread1.start();
		System.out.println("Thread1 State is : "+thread1.getState());
		
		try {
			System.out.println("");
			thread1.join();
			
			PrintTableByMultipleThreads thread2 = new PrintTableByMultipleThreads(2);
			System.out.println("The thread executing this task is " + Thread.currentThread().getName());
			thread2.start();

			PrintTableByMultipleThreads thread3 = new PrintTableByMultipleThreads(1);
			System.out.println("The thread executing this task is " + Thread.currentThread().getName());
			thread3.start();

			thread3.join();
			
			System.out.println("Thread2 state is : "+ thread2.getState());
			System.out.println("Thread3 state is : "+ thread3.getState());
		
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long et = System.currentTimeMillis();			
		System.out.println("The program took "+(et-st) +" milliseconds to get completed.");
	}

}

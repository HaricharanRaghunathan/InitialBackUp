package com.attra.thread;

public class PrintTableMainTwo {

	public static void main(String[] args) {

		long st = System.currentTimeMillis();
		System.out.println("Starting the program execution .....");
		PrintTableByMultipleThreads printTable = new PrintTableByMultipleThreads(3);
		System.out.println("The thread executing this task is " + Thread.currentThread().getName());
		printTable.start();
		
		PrintTableByMultipleThreads table = new PrintTableByMultipleThreads(2);
		System.out.println("The thread executing this task is " + Thread.currentThread().getName());
		table.start();

		try {
			printTable.join(); // This join function effectively stops the main thread (which was started
								// through start) to wait till the printTable thread is completed. So,
								// effectively now, we are able to get our time.
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long et = System.currentTimeMillis();
		System.out.println("Time taken for completion of this process is " + (et - st) + " Milliseconds");
	}

}

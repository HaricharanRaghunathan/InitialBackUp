package com.attra.thread;

public class PrintTableByMultipleThreads extends Thread {
	int n;

	public PrintTableByMultipleThreads(int n) {
		super();
		this.n = n;
	}

	@Override
	public void run() {

		print(n);
	}

	public void print(int n) {

		System.out.println("Printing the table .......");
		System.out.println("Thread executing the task is " + Thread.currentThread().getName());
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(500); // This stops the program after every execution by 500 milliseconds.
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println(i * n);

		}

	}

}
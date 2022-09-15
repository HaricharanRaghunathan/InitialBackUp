package com.attra.thread;

public class PrintTable {

	public void print(int n) {

		System.out.println("Printing the table .......");
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(500); // This stops the program after every execution by 1000 milliseconds.
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println(i * n);

		}

	}

}

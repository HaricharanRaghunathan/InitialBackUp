package com.attra.thread;

public class ThreadByRunnableInterface implements Runnable {

	@Override
	public void run() {
		System.out.println("Printing from the thread : "+ Thread.currentThread().getName());
		
	}

	public static void main(String[] args) {
		
		System.out.println("Starting the program ........");
		ThreadByRunnableInterface runnable = new ThreadByRunnableInterface();
		Thread thread = new Thread(runnable, "Runnable");
		thread.start();
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Executed by thread : "+ Thread.currentThread().getName());
		System.out.println("Program ends .....");
	}
}

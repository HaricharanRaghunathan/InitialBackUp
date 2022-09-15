package com.attra.thread;

public class WorkerThread implements Runnable{

	@Override
	public void run() {
		
		System.out.println("This is sending a message .....");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

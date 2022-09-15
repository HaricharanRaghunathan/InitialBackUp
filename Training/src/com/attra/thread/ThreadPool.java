package com.attra.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {

	public static void main(String[] args) {
		
		long st = System.currentTimeMillis();
		ExecutorService service = Executors.newFixedThreadPool(2);
		
		for(int i=0; i<10; i++)
		{
			WorkerThread thread = new WorkerThread();
			service.execute(thread);
			
			
		}
		service.shutdown(); // Closing the service
		long et = System.currentTimeMillis();
		System.out.println("Finished sending the SMS in "+(et-st)+" milliseconds");	

		
		
	}

}

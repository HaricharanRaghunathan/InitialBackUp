package com.training.home;

public class ThreadMainalt {

	public static void main(String[] args) {
		
		long st = System.currentTimeMillis();
		PrinterThreadalt pt1 = new PrinterThreadalt(11);
		PrinterThreadalt pt2 = new PrinterThreadalt(13);
		pt1.start();
		pt2.start();
		try {
			pt2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("the total time for completion is "+(System.currentTimeMillis()-st)+" milliseconds");
	}
}

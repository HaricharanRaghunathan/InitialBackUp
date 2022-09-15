package com.attra.TrainingAssignments_Set2;

public class PrinterThread extends Thread {
	
	@Override
	public void run() {
		print();
	}
	
	public void print() {
		
		for(int i=1;i<11;i++) {
			
			try {
				PrinterThread.sleep(2000);
				System.out.println(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

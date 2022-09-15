package com.training.home;

import com.attra.TrainingAssignments_Set2.PrinterThread;

	public class PrinterThreadalt extends Thread {
		int n;
		
		public PrinterThreadalt(int n) {
			super();
			this.n = n;
		}

		@Override
		public void run(){
			
			print(n);
		}
		
		public void print(int n) {
			this.n=n;
			
			for(int i=0;i<=n;i++) {
				
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
		
		
		
	

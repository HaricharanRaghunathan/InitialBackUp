package com.attra.nestedclass;

public class Anonymous {

	public static void main(String[] args) {
		
		int data = 5;
		System.out.println("Starting the program execution ......");
	
		Ekart ekart = new Ekart() {

			@Override
			void addItem() {
				System.out.println(data + " Items are added to Ekart...");
				
			}
			
		
			
		};

		System.out.println("Invoking the Anonymous Class from the Outer Class");
		ekart.addItem();
		System.out.println("Program terminated ......");
	}
}

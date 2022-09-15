package com.attra.nestedclass;

public class NestedInterfaceExample implements Printer.Samsung {

	public static void main(String[] args) {
		
		System.out.println("The program has been started ....");
		Printer.Samsung obj = new NestedInterfaceExample(); // Learn about Upcasting and Downcasting in Java from the internet as soon as possible..
		obj.print();
		
		System.out.println("The program has been completed successfully .....");
		
	}

	@Override
	public void print() {
		System.out.println("Printing your documents ......");
		
		
	}




}

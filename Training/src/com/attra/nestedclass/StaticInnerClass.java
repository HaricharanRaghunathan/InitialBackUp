package com.attra.nestedclass;

public class StaticInnerClass {

	static int started = 1994;
	String org = "Attra"; 
			
	public static void main(String[] args) {
		System.out.println("Program started ....");
		// InnerClass innerClass = new StaticInnerClass.InnerClass();
		InnerClass.printOrgDetails();
		System.out.println("The program has been terminated .....");
	}
	
	static class InnerClass{
	static	void printOrgDetails() {
			
			System.out.println("The organization was started in "+ started); // not allowing to use org variable inside the static class as it is not a static variable.
			empDetails();
		}		
	}	
	
	public static void empDetails() {
		
		System.out.println("Printing the employee details :  ");
	}
}

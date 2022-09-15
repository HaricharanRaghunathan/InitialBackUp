package com.attra.nestedclass;

public class LocalInnerClass {

	public static void main(String[] args) {

		System.out.println("Program started .....");
		LocalInnerClass innerClass = new LocalInnerClass();
		innerClass.display();

	}

	public void display() {
		System.out.println("Inside the display method of the outer class ....");
		class Local {
			void printMessage() {
				System.out.println("Printing a message from a local inner class .....");

			}

		}
		Local local = new Local();
		local.printMessage();

	}
}
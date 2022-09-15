package com.attra.TrainingAssignments_Set2;

public class Circle implements Shape {

	int a;

	@Override
	public void getArea(int a) {
		this.a = a;
	}

	public Circle(int a) {
		this.a = a;
		}
	public void mymethod() {
		System.out.println("The area of the circle is: " + (3.14 * a * a) + " sq cm");
	}

	
}

package com.attra.TrainingAssignments_Set2;

public class Square implements Shape {

	int a;

	@Override
	public void getArea(int a) {
		this.a = a;
	}

	public Square(int a) {
		super();
		this.a = a;
	}
	public void mymethod() {
		System.out.println("The area of the square is: " + (a * a) + " sq cm");
	}

	
}

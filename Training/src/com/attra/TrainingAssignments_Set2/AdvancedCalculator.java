package com.attra.TrainingAssignments_Set2;

public class AdvancedCalculator extends Calculator{

	public AdvancedCalculator(float a, float b) {
		super(a, b);
		
	}

	public AdvancedCalculator() {
		
	}
	
	public void squareroot(float a) {
		float c = (float) Math.sqrt(a);
		System.out.println("The Square Root is: "+c);
		
	}
	
	public void square(float a) {
		System.out.println("The Square is: "+(a*a));
	}
	
	public void modulus (float a, float b) {
		this.a=a;
		this.b=b;
		
		System.out.println("The Modulus is: "+(a%b));
	}
	
	
	
	
}

package com.attra.TrainingAssignments_Set1;

public class ReverseName {

	String str;
	String reverse = "";

	public ReverseName(String str) {

		this.str = str;}
	public void mymethod() {
		for (int i = str.length() - 1; i > -1; i--) {
			reverse = reverse + str.charAt(i);
		}

		System.out.println("The reversed name is : " + reverse);
		
	}
}


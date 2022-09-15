package com.attra.TrainingAssignments_Set1;

public class LengthExceededException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String str;

	public LengthExceededException(String str) {
		this.str = str;}
	
	public void mymethod() {
		if (str.length() > 4) {

			printerror();

		} else
			System.out.println("Your string is : " + str);
	}

	public void printerror() {

		System.err.println("String Length exceeded.. Please check...");
	}

}

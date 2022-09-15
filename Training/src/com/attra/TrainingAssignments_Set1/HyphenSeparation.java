package com.attra.TrainingAssignments_Set1;

public class HyphenSeparation {

	String a;
	
	public HyphenSeparation() {
		
	}

	public void mymethod(String a) {

		this.a=a;
		String rev = "";
		for(int i=a.length()-1 ; i>-1; i--) {
			rev = rev + a.charAt(i);
		} 
	
		// System.out.println(rev);
		
		String hyphenStr = "";
		int len=rev.length();
		int i;
		for(i=0; i<rev.length(); i++) {
		hyphenStr = hyphenStr + rev.charAt(i);
		if ((i+1)%4 == 0 && i!=(len-1))
		{
			hyphenStr = hyphenStr + "-";
			
		}
		}
	// System.out.println(hyphenStr);
	String ac = "";
	for(int j=hyphenStr.length()-1;j>-1;j--) {
		ac = ac + hyphenStr.charAt(j);
	}
	System.out.println("The hyphenated string is "+ ac);
	
	}

}

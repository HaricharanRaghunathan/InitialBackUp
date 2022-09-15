package com.attra.training;

import java.util.Scanner;

public class SamplePalindrome {

	public static void main(String[] args) {
		String str = "aviva",rev = "";
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter your given input");
		str = sc.nextLine();
		for(int i=str.length()-1;i>-1;i--) {
			rev = rev + str.charAt(i);
		}
		if(str.equals(rev))
			System.out.println("The give input is a palindrome ");
		else
			System.out.println("The given input is not a palindrome");
	sc.close();
	}

	
}

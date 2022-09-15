package com.attra.training;

import java.util.Scanner;

public class SampleRelationalOperators {

	public static void main(String[] args) {
		int a,b;
		Scanner x = new Scanner(System.in);
		Scanner y = new Scanner(System.in);
		System.out.println("Please enter the first number");
		a = x.nextInt();
		System.out.println("Please enter the second number");
		b= y.nextInt();
		if(a<b)
			System.out.println(a + " is lesser in value than " + b);
		else if (a>b)
			System.out.println(a + " is greater in value than " + b);
		else
			System.out.println(a + " is equal in value to " + b);
	x.close();
	y.close();
	}

}

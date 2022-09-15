package com.training.home;

import java.util.Scanner;

public class SampleFunction {

	public static void main(String[] args) {
		int number;
		int remainder;
		int reverse=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your number : ");
		number = sc.nextInt();
		
		for (;number !=0; number=number/10) {
			remainder = number%10;
			reverse = reverse*10 + remainder;
		}
		
		sc.close();
		System.out.println("The reversed number is : " + reverse);
	}

}

package com.attra.training;

import java.util.Scanner;

public class SampleByte {

	public static void main(String[] args) {
		
		Scanner x = new Scanner (System.in);
		System.out.println("Type your given input ");
		int i = x.nextInt();
		int j = i-1;
		System.out.println("Your given input is : " + i + " ,the next number is : "+ ++i + " and the preious number is : " + j);
		x.close();
	}			
}

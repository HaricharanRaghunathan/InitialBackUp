package com.attra.training;

import java.util.Scanner;

public class SampleDoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println("Enter the number (Not greater than 10)");
			n=sc.nextInt();
		} while (n>10); //The while condition must be false. Then only the loop will be exited. 
		System.out.println(n + " : Your entry is valid.");
		sc.close();
	}

}

package com.attra.training;

public class SampleReversingString {

	public static void main(String[] args) {

		String s1 = "haricharan";
		for (int i = s1.length() - 1; i >= 0; i--) {
			System.out.println(s1.charAt(i));
		}
	}

}

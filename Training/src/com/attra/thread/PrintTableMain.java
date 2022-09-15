package com.attra.thread;

public class PrintTableMain {

	public static void main(String[] args) {
		long st = System.currentTimeMillis();
		System.out.println("Starting the program execution .....");
		PrintTable printTable = new PrintTable();
		printTable.print(3);

		PrintTable table = new PrintTable();
		table.print(2);

		System.out.println(
				"Time taken for completion of this process is " + (System.currentTimeMillis() - st) + " Milliseconds");

	}

}

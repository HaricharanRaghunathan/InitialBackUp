package com.training.twentyfouraugust;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadContentFromFile {

	public static void main(String[] args) {

		System.out.println("Program has started ...........");
		File file = new File("D:\\Training Workspace\\New folder\\SampleText.txt");
		Scanner sc = null;
		try {
			if (file.exists()) {
				sc = new Scanner(file);
				System.out.println("Printing the contents of the file ...........");
				while (sc.hasNextLine()) {
					System.out.println(sc.nextLine());
				}
			}
			System.out.println("Can the file be read : " + file.canRead());
			System.out.println("Does the file have write permission : " + file.canWrite());
			System.out.println("File Name : " + file.getName());
			System.out.println("The Absolute path of the file is : " + file.getAbsolutePath());
			sc.close();
			System.out.println("Is the file deleted : " + file.delete());
		} catch (FileNotFoundException e) {
			System.err.println("Error while reading the contents of this file ......");
			e.printStackTrace();
		}

	}

}

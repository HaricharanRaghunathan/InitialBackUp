package com.training.twentyfouraugust;

import java.io.File;
import java.io.IOException;

public class CreateMultipleFiles {

	public static void main(String[] args) {
		System.out.println("System is staring the program .............");
		for (int i = 1; i < 6; i++) {
			File file = new File("D:\\Training Workspace\\New folder\\CreateFile" + i + ".txt");
			try {
				boolean IsCreated = file.createNewFile();
				if (IsCreated) {
					System.out.println("File created Successfully .............");
				} else {
					System.out.println("File could not be created ..........");
				}
			} catch (IOException e) {
				System.err.println("Error in creating file ............");
				e.printStackTrace();
			}
		}

	}
}
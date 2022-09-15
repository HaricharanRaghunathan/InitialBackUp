package com.training.twentyfouraugust;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		System.out.println("System is staring the program .............");
		File file = new File("D:\\Training Workspace\\New folder\\File.txt");
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
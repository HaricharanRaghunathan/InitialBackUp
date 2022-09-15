package com.training.twentyfouraugust;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteContentToFile {

	public static void main(String[] args) {

		File file = new File("D:\\Training Workspace\\New folder\\SampleText.txt");
		try {
			if (!file.exists()) {
				System.out.println("Creating a New File .....");
				file.createNewFile();
			}
			System.out.println("Writing contents into the file .....");
			FileWriter filewriter = new FileWriter(file);
			filewriter.write("Hello!");
			filewriter.write("\t This is a file written using FileWriter Command.");
			filewriter.write("\t This file was written on 24th August 2022.");
			filewriter.close();
			System.out.println("Content written into the file successfully .....");

		} catch (IOException e) {
			System.out.println("No Permission to write content .....");
			e.printStackTrace();
		}

	}

}

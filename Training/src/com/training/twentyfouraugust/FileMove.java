package com.training.twentyfouraugust;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileMove {

	public static void main(String[] args) {

		String src = "D:\\Training Workspace\\New folder\\File.txt";
		String sourcedir = "D:\\Training Workspace\\New folder\\";
		File file = new File("\"D:\\Training Workspace\\New folder\\Another Folder\\File1.txt");
		String tar = "D:\\Training Workspace\\New folder\\Another Folder\\File1.txt";
		System.out.println("The Program has started ......");

		try {
			Path path = Files.move(Paths.get(src), Paths.get(tar));
			System.out.println(path);
		} catch (IOException e) {
			System.err.println("The File could not be moved .......");
			e.printStackTrace();
		}
		System.out.println("The file has been moved successfully");

	}

}

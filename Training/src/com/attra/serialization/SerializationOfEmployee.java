package com.attra.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationOfEmployee {

	public static void main(String[] args) {

		System.out.println("The Program has started  .......");
		FileOutputStream fileOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream("D:\\Training Workspace\\Serialization\\Employee.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ObjectOutputStream objectOutputStream = null;
		try {
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Employee e1 = new Employee("Ravi", 326001, "ravi.v@attra.com.au");
		Employee e2 = new Employee("Asher", 322222, "asher.m@attra.com.au");
		try {
			objectOutputStream.writeObject(e1);
			objectOutputStream.writeObject(e2);
			;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The employee has been Serialized successfully .....");
	}

}

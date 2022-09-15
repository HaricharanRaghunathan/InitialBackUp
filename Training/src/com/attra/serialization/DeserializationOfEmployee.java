package com.attra.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationOfEmployee {

	public static void main(String[] args) {

		System.out.println("The Deserialization program has started");
		ObjectInputStream objectInputStream = null;
		try {
			FileInputStream fileInputStream = new FileInputStream(
					"D:\\Training Workspace\\Serialization\\Employee.txt");
			objectInputStream = new ObjectInputStream(fileInputStream);
			Employee emp = (Employee) objectInputStream.readObject();
			System.out.println("The state of the Deserialized object is : ");
			System.out.println(emp.toString());
			objectInputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

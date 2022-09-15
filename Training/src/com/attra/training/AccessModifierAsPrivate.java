package com.attra.training;


class  A { // This class is only accessible inside the current package of com.attra.training. This class can't be accessed in any other package. 
	
	public int data=50;
	public void msg()
	{
		System.out.println("This is the Official Foriegn Policy of the Third Reich, Comrade Stalin.");
		
	}

	
}

public class AccessModifierAsPrivate {

	public static void main(String[] args) {
		A obj = new A();
		System.out.println(obj.data);
		obj.msg();
	}

}

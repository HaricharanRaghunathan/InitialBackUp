package com.TestCorrection;

class box {
	double width;
	double height;
	double length;
}

class mainclass {
	public static void main(String args[]) {
		box obj1 = new box();
		box obj2 = new box();
		obj1.height = 1;
		obj1.length = 2;
		obj1.width = 3;
		obj2 = obj1;
		System.out.println(obj2.height);
	}
}
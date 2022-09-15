package com.attra.TrainingAssignments_Set2;

import com.attra.TrainingAssignments_Set1.HyphenSeparation;
import com.attra.TrainingAssignments_Set1.LargestNumber;
import com.attra.TrainingAssignments_Set1.LengthExceededException;
import com.attra.TrainingAssignments_Set1.MyVehicle;
import com.attra.TrainingAssignments_Set1.PrimeTillHundred;
import com.attra.TrainingAssignments_Set1.ReverseName;

public class MainProgram {
	public static void main(String[] args) {

		// SET 1 PROGRAM 1
		PrimeTillHundred pt1 = new PrimeTillHundred();
		pt1.mymethod();
		System.out.println("\n");
		
		//SET 1 PROGRAM 2
		int [] array = {5,11,22};
		LargestNumber ln = new LargestNumber(array);
		ln.mymethod();
		System.out.println("\n");
		
		// SET 1 PROGRAM 3
		ReverseName rn = new ReverseName("haricharan");
		rn.mymethod();
		System.out.println("\n");
		
		//SET 1 PROGRAM 4
		HyphenSeparation hs = new HyphenSeparation();
		hs.mymethod("123456789");
		System.out.println("\n");
		
		// SET 1 PROGRAM 5
		LengthExceededException lc = new LengthExceededException("1234");
		lc.mymethod();
		LengthExceededException lc2 = new LengthExceededException("12345");
		lc2.mymethod();
		System.out.println("\n");
		
		// SET 1 PROGRAM 7
		MyVehicle a2 = new MyVehicle();
		a2.setVcolor("Red");
		a2.setVname("Alto");
		a2.setVprice(150000);
		a2.setVyear(2021);
		a2.printst();
		System.out.println("\n");
		MyVehicle a1 = new MyVehicle(2020, "i10", 100000, "Red");
		System.out.println("The colour of the Vehicle is " + a1.getVcolor());
		
		// SET 2 PROGRAM 1
		Calculator calc = new Calculator();
		calc.add(10, 10);
		calc.subtract(10, 5);
		calc.multiply(2, 5);
		calc.divide(10, 2);
		System.out.println("\n");
		
		// SET 2 PROGRAM 2
		AdvancedCalculator adv = new AdvancedCalculator();
		adv.add(5, 3);
		adv.subtract(9, 2);
		adv.multiply(20, 10);
		adv.divide(15, 3);
		adv.modulus(10, 3);
		adv.square(6);
		adv.squareroot(16);
		System.out.println("\n");
		
		// SET 2 PROGRAM 3
		Circle cir = new Circle(10);
		cir.mymethod();
		System.out.println("\n");
		Square sq = new Square(10);
		sq.mymethod();
		System.out.println("\n");
		
		// SET 2 PROGRAM 4
		PrinterThread pt = new PrinterThread();
		pt.start();
		System.out.println("\n");
		
	}
}

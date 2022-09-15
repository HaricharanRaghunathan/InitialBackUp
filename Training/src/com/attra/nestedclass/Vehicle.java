package com.attra.nestedclass;

public class Vehicle {

	private int speed = 80;
	
	public void workType() {
	
	System.out.println("Automatic with Petrol as fuel");
	
	}
	
	class Car{
		
		void drive () {
			System.out.println("This car runs with an average speed of "+speed+" mph.");
			workType();
		}
			
	}

	public static void main(String[] args) {
		
		System.out.println("The program has started ......");
	Vehicle vehicle = new Vehicle();
	Car car = vehicle.new Car();
	car.drive();
	
	System.out.println("Program completed ......");
	}
	
}

package com.trainingStatic;

public class Employee {
		int eid;
		String ename; // Here both eid and ename are Instance Variables as they change with every instance.
		static String company="Attra"; //Here company is a Static Variable as they won't change with every instance. They are costant.
		public void display()
		{
			System.out.println("Employee ID: " + eid +" Name: " + ename + " Company Name : "+ company);
		}

		public Employee(int eid, String ename)
		{
			super();
			this.eid=eid;
			this.ename=ename;
		}
}

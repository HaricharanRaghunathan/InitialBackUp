package com.attra.TrainingAssignments_Set1;

public class MyVehicle {

	int vyear;
	String vname;
	double vprice;
	String vcolor;
	
		
	public MyVehicle(int vyear, String vname, double vprice, String vcolor) {
		super();
		this.vyear = vyear;
		this.vname = vname;
		this.vprice = vprice;
		this.vcolor = vcolor;
	}


	public MyVehicle() {
		// TODO Auto-generated constructor stub
	}

	public int getVyear() {
		return vyear;
	}


	public void setVyear(int vyear) {
		this.vyear = vyear;
	}


	public String getVname() {
		return vname;
	}


	public void setVname(String vname) {
		this.vname = vname;
	}


	public double getVprice() {
		return vprice;
	}


	public void setVprice(double vprice) {
		this.vprice = vprice;
	}


	public String getVcolor() {
		return vcolor;
	}


	public void setVcolor(String vcolor) {
		this.vcolor = vcolor;
	}


	
	public void printst() {
		System.out.println("The Vehicle was built in " + vyear + ", the vehicle name is = " + vname + ", its Price is " + vprice + ", and its color is " + vcolor + "]");
	}

	
}

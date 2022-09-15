package Apartment;

public class Apartment {

	int bhk;
	int area;
	double rent;
	String furnish;
	
	public void display()
	{
		System.out.println("Tha apartment details are as follows: "+bhk+"\t"+area+"\t"+rent+"\t"+furnish);
	}

	public Apartment(int bhk, int area, double rent, String furnish) {
		super();
		this.bhk=bhk;
		this.area=area;
		this.rent=rent;
		this.furnish=furnish;
	}
}

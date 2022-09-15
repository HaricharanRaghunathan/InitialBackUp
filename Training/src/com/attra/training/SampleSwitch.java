package com.attra.training;

import java.util.Scanner;

public class SampleSwitch {

	public static void main(String[] args) {
		int number;
		Scanner x = new Scanner(System.in);
		System.out.println("Type in the new number");
		number = x.nextInt();
		switch(number) {
		case 10 : System.out.println("The number printed is 10");
		break;
		case 20 : System.out.println("The number printed is 20");
		break;
		case 30 : System.out.println("The number printed is 30 ");
		break;
		default: System.out.println("The number printed is not 10, 20 or 30");
		}
		x.close();
		String s;
		Scanner y = new Scanner(System.in);
		System.out.println("Type in the game - Hockey, Cricket or Football :");
		s = y.nextLine();
		switch(s) {
		case "Hockey" : System.out.println("The game chosen is Hockey");
		break;
		case "hockey" : System.out.println("The game chosen is Hockey");
		break;
		case "Football": System.out.println("The game chosen is Football");
		break;
		case "football": System.out.println("The game chosen is Football");
		break;
		case "Cricket": System.out.println("The game chosen is Cricket");
		break;
		case "cricket": System.out.println("The game chosen is Cricket");
		break;
		default: System.out.println("The game chosen is neither Cricket, Hockey or Football");
		}
		y.close();
		char ch;
		Scanner z = new Scanner(System.in);
		System.out.println("Please enter your Grade :");
		ch = z.next().charAt(0);
		switch(ch) {
		case 'A' : System.out.println("You have got 100 marks");
		break;
		case 'B' : System.out.println("You have got 90 marks");
		break;
		case 'C' : System.out.println("You have got 80 marks");
		break;
		case 'D' : System.out.println("You have got 70 marks");
		break;
		case 'E' : System.out.println("You have got 60 marks");
		break;
		case 'F' : System.out.println("You have got 40 marks");
		break;
		default: System.out.println("Invalid Input");
		}
		z.close();
		int month;
		String mstring = "";
		Scanner w = new Scanner(System.in);
		System.out.println("Please enter the Month in number (1-12) :");
		month = w.nextInt();
		switch (month) {
		case 1: mstring="January";
		break;
		case 2: mstring="February";
		break;
		case 3: mstring="March";
		break;
		case 4: mstring="April";
		break;
		case 5: mstring="May";
		break;
		case 6: mstring="June";
		break;
		case 7: mstring="July";
		break;
		case 8: mstring="August";
		break;
		case 9: mstring="September";
		break;
		case 10: mstring="October";
		break;
		case 11: mstring="November";
		break;
		case 12: mstring="December";
		break;
		default: System.out.println("Invalid Input");
		break;
		}
		System.out.println("The name of the month is "+ mstring);
		w.close();
	}
}
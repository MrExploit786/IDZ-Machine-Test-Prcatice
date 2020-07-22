package pactice;

import java.util.Scanner;

public class Switch {

	
	public static void main(String[] args) {
		
		
		System.out.println("Enter the Month");
		
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		switch(month) {
		
		case 1 : System.out.println("Januvary");
		break;
		
		case 2 : System.out.println("Feb");
		break;
		
		case 3 : System.out.println("March");
		break;
		
		case 4 : System.out.println("April");
		break;
		
		case 5 : System.out.println("May");
		break;
		
		default : System.out.println("Not Valid");
		
		
		}
	}
}

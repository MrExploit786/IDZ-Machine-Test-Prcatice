package pactice;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		System.out.println("Enter the first number");
		
		Scanner sc = new Scanner(System.in);
		
		int num1= sc.nextInt();
		
		System.out.println("Enter the second number");
		
		int sum=0;

		int num2=sc.nextInt();
		
		while(num1 !=0 && num2!=0){
			
			 sum = num1+num2;
			 
		 System.out.println("addition is "+ sum);
			
		}
	
		


	}
	
	
}

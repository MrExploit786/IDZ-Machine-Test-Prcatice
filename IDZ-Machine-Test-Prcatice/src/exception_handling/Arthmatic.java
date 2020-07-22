package exception_handling;

import java.util.Scanner;

public class Arthmatic {
	
	
	public static void main(String[] args) {
		
		try{Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int num = sc.nextInt();
		
		int divide = 232; 
		
		
		int divisable = divide /num; 
		

		
		System.out.println("my divisable number is "+ divisable);
		
		}

		
		
		catch (ArithmeticException e) {
		
			e.printStackTrace();
		
		
		}
		
		
		
		
	}


	

	
	
	
}

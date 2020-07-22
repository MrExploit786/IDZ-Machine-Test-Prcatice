package pactice;

import java.util.Scanner;

public class Table_number {
	
public static void main(String[] args) {
	
	System.out.print("Enter the number : ");
	Scanner sc = new Scanner(System.in);
	
	int num = sc.nextInt();
	
	
	for (int i = 1 ; i<=10;  i++) {
		
		System.out.println(num + "*" + i + "=" + num*i);
	}
}
}

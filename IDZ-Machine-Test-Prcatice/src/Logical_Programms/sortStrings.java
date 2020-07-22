package Logical_Programms;

// Question-2: Write code to sort the list of strings using Java collection?

import java.util.*;

public class sortStrings {

	
	public static void main(String[] args) {
		
		
		String [] inputlist = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
				"aug", "Sep", "Oct", "nov", "Dec" };	
		
	 // array string 
	 
	//Display input un-sorted list.
			System.out.println("-------Input List-------");
			showList(inputlist);
			
			
			
			
			// Call to sort the input list.
			Arrays.sort(inputlist);

			
			// Display the sorted list.
			System.out.println("\n-------Sorted List-------");
			showList(inputlist);

			
			// Call to sort the input list in case-sensitive order.
			System.out.println("\n-------Sorted list (Case-Sensitive)-------");
			Arrays.sort(inputlist, String.CASE_INSENSITIVE_ORDER);

			
			
			// Display the sorted list.
			showList(inputlist);
	}
 
 
	public static void showList(String[] array) {
		for (String str : array) {
			System.out.print(str + " ");
		}
		System.out.println();
	}

}

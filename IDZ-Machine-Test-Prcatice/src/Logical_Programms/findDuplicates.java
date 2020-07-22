package Logical_Programms;

//Question-1: Write code to filter duplicate elements from an array and print as a list?


import java.util.*;

public class findDuplicates {

	
	public static void main(String[] args) {
		
		
		ArrayList<String> list = new ArrayList<>();
		
		// pritntion 0 to 9 
		
		for(int i = 0 ;i<=9;i++) {
			 
			list.add(String.valueOf(i));
		}
		
		// Insert a new set of numbers from 0-5.
				for (int i = 0; i < 5; i++) {
					list.add(String.valueOf(i));
				}

				System.out.println("Input list : " + list);
				System.out.println("\nFiltered duplicates : " +processList(list));


		
	}
	
	// now create method of process list 
	
	
	
	public static Set<String> processList(List<String> listContainingDuplicates){
		
		final Set<String> resultSet = new HashSet<String>(); // creating 
		final Set<String> tempSet = new HashSet<String>();

		//advance for loop 
		
		for (String yourint : listContainingDuplicates ) {
			
			if(!tempSet.add(yourint)) {
				resultSet.add(yourint);
			}
		}
		
		return resultSet; 
	}
}


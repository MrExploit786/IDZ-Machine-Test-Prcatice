package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class AList {

	
	public static void main(String[] args) {
		
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Bksjhkahdk");
		al.add("sf");

		al.add("sadfa");
		al.add("atrt");

		
		Collections.sort(al);
		
		// itreating 
		
		for(String am : al)
		{
			System.out.println(am);
		}
		
				
				
	}
}

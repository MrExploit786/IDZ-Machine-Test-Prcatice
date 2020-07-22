package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked_list {
	
	public static void main(String[] args) {
		
	     LinkedList<String> list=new LinkedList<String>();
	     
	     
	     
	     list.add("banana");
	     list.add("mango");
	     list.add("jackfruit");
	     list.add("grapes");

	     
	     System.out.println("size : "+list.size());
	     
	     list.addFirst("lockey");
	     
	     System.out.println("List Itration using Advance For Loop");
	     
	     
	     for(String lo : list) {
	    	 System.out.println(lo);
	     }
		
	     System.out.println("List Itration using Itrator  For Loop");

		Iterator<String> it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
 	}

}

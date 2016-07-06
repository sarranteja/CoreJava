package collections.list.practice;

import java.util.ArrayList;

/**
 * @author Saran
 *
 */
public class ArrayListDemo {
	
	public static void main(String args[]){
		ArrayList al = new ArrayList();
		//Insertion order is preserved and duplicates are allowed
		// Underlying data structure is resizable or growable array
		//Mainly used for retrieval operations
		al.add("a");
		al.add(new Integer(12));
		al.add(null);
		al.add(new Object());
		System.out.println(al);
		al.remove(new Integer(12));
		System.out.println(al);
		al.add(0,"b");
		al.add(3,"a");
		System.out.println(al);
		al.add(null);
		al.set(0,"13");
		System.out.println(al);
		
		
		
	}

}

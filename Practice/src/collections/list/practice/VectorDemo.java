package collections.list.practice;

import java.util.Vector;

public class VectorDemo {

	public static void main(String args[]){
		//Insertion order is preserved and duplicates are allowed
		// Underlying data structure is resizable or growable array
		//Mainly used for retrieval operations
		//all methods are synchronized
		Vector v = new Vector();
		System.out.println(v.capacity());
		
		for(int i=0;i<9;i++){
			v.addElement(new Integer(i));
		}
		System.out.println(v);
		v.addElement("a");
		System.out.println(v.capacity());
		v.addElement("12");
		System.out.println(v.capacity());
		v.remove(10);
		System.out.println(v.capacity());
		System.out.println(v.size());
	}
}

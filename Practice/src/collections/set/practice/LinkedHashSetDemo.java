package collections.set.practice;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	
	public static void main(String args[]){
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		//Insertion order is preserved and duplicates are not allowed
		//Underlying data structure is Linked list and Hash table
		//Uses hashing technique to store the indexes of the values
		//null is allowed
		set.add("a");
		set.add("b");
		set.add("a");
		set.add("c");
		set.add("t");
		set.add(null);
		set.add(null);
		System.out.println(set);
	}

}

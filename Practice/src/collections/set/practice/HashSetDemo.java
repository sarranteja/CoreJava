package collections.set.practice;

import java.util.HashSet;

public class HashSetDemo {

	
	public static void main(String args[]){
		HashSet<String> set = new HashSet<String>();
		//No Insertion order preserved and duplicates not allowed
		//Underlying data structure is Hash table
		//Uses hashing technique to store the indexes of the values
		//null is allowed
		set.add("a");
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		set.add("e");
		set.add(null);
		set.add(null);
		System.out.println(set);
		
	}
}

package collections.set.practice;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
	
	public static void main(String args[]){
		
		//Child Interface of Set
		//it represents objects in sorting order
		//Uses default natural sorting order (Ascending)
		//comparator method returns null if default natural sorting is used
		//null is not allowed
		SortedSet set = new TreeSet();
		set.add(1);
		set.add(2);
		set.add(5);
		set.add(4);
		set.add(3);
		set.add(0);
		System.out.println(set.first());
		System.out.println(set);
		
	}
		
}

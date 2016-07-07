package collections.util.practice;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsUtilDemo {
	
	public static void main(String args[]){
		binarySearchDemo();
		collectionsReverse();
	}

	
	public static void binarySearchDemo(){
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(5);
		l.add(8);
		l.add(7);
		l.add(3);
		l.add(4);
		System.out.println(l);
		//To do binary search the elements should sorted else will get inconsistent results
		System.out.println(Collections.binarySearch(l, 7));
		Collections.sort(l);
		System.out.println(l);
		//binary search after sorting the list as per natural sorting order
		System.out.println(Collections.binarySearch(l, 7));
	}
	
	public static void collectionsReverse(){
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(5);
		l.add(8);
		l.add(7);
		l.add(3);
		l.add(4);
		System.out.println(l);
		Collections.reverse(l);
		System.out.println(l);
	}
}

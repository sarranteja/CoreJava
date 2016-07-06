package collections.comparator.pratice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class ComparatorDemo {
	
	
	public static void main(String args[]){
		
		TreeSet s = new TreeSet(new MyComparator());
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		s.add(6);
		System.out.println(s);
		
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		System.out.println(list);
		list.sort(new MyComparator()); // we can use eitheir list sort
		Collections.sort(list,new MyComparator()); // we can use collection sort
		System.out.println(list);
		
	}

}

package collections.iterators.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class InteratorDemo {

	public static void main(String args[]){
		ArrayList al = new ArrayList();
		
		al.add("a");
		al.add(new Integer(12));
		al.add(null);
		al.add(new Object());
		al.add(0,"b");
		al.add(3,"a");
		al.add(null);
		System.out.println(al);
		
		Iterator i = al.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
			i.remove();
		}
		System.out.println(al);
	}
}

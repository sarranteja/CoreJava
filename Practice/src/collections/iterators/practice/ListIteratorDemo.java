package collections.iterators.practice;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {
	
	public static void main(String args[]){
		
		LinkedList<String> l = new LinkedList<String>();
		l.add("C");
		l.add("java");
		l.add(".Net");
		l.add("Database");
		
		ListIterator<String> i = l.listIterator();
		
		while(i.hasNext()){
			String s=i.next();
			if(s.equalsIgnoreCase("C")){
				i.add("Pointers");
			}
			else if(s.equalsIgnoreCase("java")){
				i.add("Servlets");
			}
			
			System.out.println(s);
		}
		System.out.println(l);
	}

}

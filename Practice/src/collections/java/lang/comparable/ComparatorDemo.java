package collections.java.lang.comparable;

import java.util.TreeSet;

public class ComparatorDemo {
	
	public static void main(String args[]){
		
		//Comparable implements default natural sorting
		//Every Wrapper class internally implements Comparable interface
		
		System.out.println("a".compareTo("b"));
		System.out.println("b".compareTo("a"));
		
		//Tree Set sorting is based on comparable 
		
		TreeSet s = new TreeSet();
		s.add("b");
		s.add("a"); // "b".compareTo("a"); -ve a is added first
		System.out.println(s);
	}

}

package collections.set.practice;

import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String args[]){
		//Sorts according to default natural order
		TreeSet<Integer> s = new TreeSet<Integer>();
		s.add(4);
		s.add(7);
		s.add(8);
		s.add(3);
		s.add(5);
		s.add(2);
		s.add(6);
		s.add(1);
		s.add(1);//no duplicates allowed
		System.out.println(s);
		System.out.println(s.comparator());
		nullCheck();// null insertion is not possible
		hetrogeniousObjectsTest();// hetrogenius objects are not allowed
		comparableCheck();// only classes which implements comparable Interface are sorted in treeset
	}

	public static void nullCheck(){
		TreeSet s1 = new TreeSet();
		s1.add(null);
		/*s.add(4);
		s.add(7);
		s.add(8);
		s.add(3);
		s.add(5);
		s.add(2);
		s.add(6);
		s.add(1);*/
	}
	
	public static void hetrogeniousObjectsTest(){
		TreeSet s = new TreeSet();
		s.add(1);
		s.add("a");
	}
	
	public static void comparableCheck(){
		TreeSet s2= new TreeSet();
		
		s2.add(new StringBuffer("a"));
		s2.add(new StringBuffer("b"));
		s2.add(new StringBuffer("f"));
		s2.add(new StringBuffer("c"));
		System.out.println(s2);
	}
}

package collections.comparator.pratice;

import java.util.TreeSet;

public class SortEmployeeDemo {
	
	public static void main(String args[]){
		
		// Sort employees by there salary in ascending order
		// if two employees salaries are equal then sort by there employee name
		
		TreeSet<Employee> s = new TreeSet<Employee>(new EmployeeComparator());
		Employee e1 = new Employee();
		e1.setName("a");
		e1.setSal(500d);
		
		Employee e2 = new Employee();
		e2.setName("b");
		e2.setSal(500d);
		
		Employee e3 = new Employee();
		e3.setName("c");
		e3.setSal(200d);
		
		Employee e4 = new Employee();
		e4.setName("d");
		e4.setSal(100d);
		s.add(e1);
		s.add(e2);
		s.add(e3);
		s.add(e4);
		System.out.println(s);
		
	}

}

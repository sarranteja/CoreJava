package collections.comparator.pratice;

import java.util.Comparator;

public class EmployeeComparator implements Comparator {

	public int compare(Object o1, Object o2) {
		Employee e1 =(Employee)o1;
		Employee e2 =(Employee)o2;
		
		if(e1.getSal().compareTo(e2.getSal()) == 0){
			return e1.getName().compareTo(e2.getName());
		}
		return e1.getSal().compareTo(e2.getSal());
	}

}

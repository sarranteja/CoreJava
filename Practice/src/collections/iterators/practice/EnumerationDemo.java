package collections.iterators.practice;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

	public static void main(String args[]){
		Vector v = new Vector();
		
		for(int i=1;i<10;i++){
			v.addElement(new Integer(i));
		}
		
		Enumeration e = v.elements();
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
	}
}

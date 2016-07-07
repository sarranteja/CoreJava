package map.pratice;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {
	
	public static void main(String args[]){
		
		// Tree map keys are sorted based on natural sorting order
		SortedMap s =new  TreeMap();
		//it doesnt allow null value as key
		//s.put(null,"a");
		//keys are only homogenus elements and should be implementing comparable by default
		// we can use Comparator for own sorting method other than natural sorting order
		s.put(1, "a");
		s.put(8, "b");
		s.put(6, "i");
		System.out.println(s);
	}

}

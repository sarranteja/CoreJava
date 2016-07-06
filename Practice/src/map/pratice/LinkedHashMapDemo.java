package map.pratice;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
	
	public static void main(String args[]){
		
		//Insertion order is preserved
		// used linkedlist data struture
		// duplicate keys not allowed
		// duplicate values are allowed
		LinkedHashMap lMap = new LinkedHashMap();
		lMap.put(1, "a");
		lMap.put(5, "h");
		lMap.put(2, "b");
		lMap.put(null, "a");
		lMap.put(null, "a");
		
		System.out.println(lMap);
	}

}

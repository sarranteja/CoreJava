package map.pratice;

import java.util.IdentityHashMap;

public class IdentityHashMapDemo {

	public static void main(String args[]){
		//HashMap uses equals method to identify duplicate keys (equals uses content comparison)
		//Identity HashMap uses == i.e. reference comparison
		IdentityHashMap imp = new IdentityHashMap();
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		imp.put(i1, "a");
		imp.put(i2, "b");
		
		//if we replace IdentityHashMap with HashMap then only one key is added
		System.out.println(imp);
	}
}

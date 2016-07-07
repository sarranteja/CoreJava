package map.pratice;

import java.util.Hashtable;

public class HashTableDemo {
	
	public static void main(String args[]){
		//insertion order is not preserved
		Hashtable table = new Hashtable();
		//Hash table is synchronized 
		//duplicates keys are not allowed
	    table.put(1,"12");
	    table.put(1,"12");
	    //null key or null value are not allowed
	    //table.put(null, "a");
	    //table.put(1,null);
	    System.out.println(table);
		
	}

}

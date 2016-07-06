package map.pratice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class HashMapDemo {
	
	public static void main(String args[]){
		HashMap map = new HashMap();
		
		// duplicate keys are not allowed but values can be duplicated
		// keys are generated by hashing technique so duplicates are not allowed and insertion is not preserved
		map.put(1, "a");
		map.put(2, "a");
		map.put(3, "a");
		map.put(4, "a");
		//null keys are allowed only once
		map.put(null, "a");
		map.put(null, "a");
		
		Iterator it= map.entrySet().iterator();
		
		while(it.hasNext()){
			Map.Entry e = (Map.Entry)it.next();
			System.out.println(e.getValue() +""+e.getKey());
		}
		System.out.println(map);
	}
}
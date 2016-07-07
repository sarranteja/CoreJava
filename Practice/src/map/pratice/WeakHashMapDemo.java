package map.pratice;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
	
	
	public static void main(String args[]){
		//testHashMap(); //testing hash map
		testWeakHashMap(); // testing weak hash map
	}
	
	/**HashMap dominates garbage collection. Even though temp doesn't have any external references it
	is not eligible for garbage collection **/
	public static void testHashMap(){
		HashMap whm = new HashMap();
		Temp t = new Temp();
		whm.put(t, "a");
		System.out.println(whm);
		t=null;
		System.gc();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(whm);
	}
	
	/**In case of WeakHashMap though temp doesn't have any external references it
	is  eligible for garbage collection **/
	public static void testWeakHashMap(){
		
		WeakHashMap whm = new WeakHashMap();
		Temp t = new Temp();
		whm.put(t, "a");
		System.out.println(whm);
		t=null;
		System.gc();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(whm);
	}

}

package collections.util.practice;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListDemo {

	public static void main(String args[]){
		//we can convert an array to List type 
		Integer[] i= {1,2,3,4,5};
		
		List l = Arrays.asList(i);
		//If we change anything list refernce it will be changed in array as well
		l.set(0, 6);
		System.out.println(l);
		for(int j:i){
			System.out.println(j);
		}
		
	}
}

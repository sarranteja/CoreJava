package collections.util.practice;

import java.util.Arrays;

public class ArraysUtilDemo {
	
	public static void main(String args[]){
		
		// for primitive
		int [] iArray =  {1,7,6,4,8,9};
		
		// Arrays util class provides sorting feature for primitive types and Objects types
		Arrays.sort(iArray);
		for (int i : iArray) {
			System.out.println(i);
		}
		
		//for Wrapper classes
		String[] s = {"l","i","w","t"};
		Arrays.sort(s);
		for (String p : s) {
			System.out.println(p);
		}
		
		//We can use comprator for customized sorting but primitives cannot have customized sorting
		//Arrays also provides method for binary search and the rules are same as Collections
	}

}

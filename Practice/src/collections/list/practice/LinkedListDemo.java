package collections.list.practice;

import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String args[]){
		
		//Insertion order is preserved and duplicates are allowed
		// Underlying data structure is Linked List
		//Mainly used for insertion or deletion operations in middle
		LinkedList list = new LinkedList();
		list.add("a");
		System.out.println(list);
		list.addFirst("b");
		System.out.println(list);
		list.addLast("c");
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		list.removeFirst();
		System.out.println(list);
		list.add(1, "t");
		System.out.println(list);
	}

}

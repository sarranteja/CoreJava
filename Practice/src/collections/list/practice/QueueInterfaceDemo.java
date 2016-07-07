package collections.list.practice;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterfaceDemo {
	
	public static void main(String args[]){
		//Queue usally uses FIFO 
		//Linked list implements Queue Interface
		Queue q = new LinkedList();
		
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.add(6);
		q.offer(7);
		
		System.out.println(q);
		//Peek returns null if there is no element
		System.out.println("Queue Peek "+q.peek()); // returns first added element
		//element returns NoSuchElementException if there is no element
		System.out.println("Queue element method" +q.element()); // returns head element
		System.out.println(q);
		//if there is no element poll returns null
		System.out.println("Queue poll method " + q.poll());// removes head element and returns it
		System.out.println(q);
		//if there is no element remove returns NoSuchElementException
		System.out.println("Queue remove method "+q.remove());//removes head element
	}

}

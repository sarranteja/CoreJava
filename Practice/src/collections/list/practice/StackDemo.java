package collections.list.practice;

import java.util.Stack;

public class StackDemo {
	
	
	public static void main (String args[]){
		//LIFO algortihm is used
		//Duplicates are allowed
		Stack<Integer> s = new Stack<Integer>();
		for(int i=0;i<9;i++){
			s.add(i);
		}
		s.add(0);
		while(!s.isEmpty()){
			System.out.println(s.pop());
		}
	}
	
	public void hackerRank(){
		String s="({()[]})";
		boolean flag = false;
		Stack st = new Stack();
		// Push operation
		char[] sTokens=s.toCharArray();
		for(char c: sTokens){
			st.push(c);
		}
		while(!st.isEmpty()){
		if(st.size()%2!=0){
			flag=false;
			break;
		}else if(st.peek().equals(st.lastElement())){
			flag=true;
			st.pop();
			st.removeElement(st.lastElement());
		}
		}
		System.out.println(flag);
	}
	
}

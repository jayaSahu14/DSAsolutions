package DataStructures.Stack;

import java.util.Stack;

public class sdd {

	public void pushAtBottom(Stack s, int data) {
		
		if(s.isEmpty()) {
			s.push(data); return;
		}
		
		int top=(int) s.pop();		
		pushAtBottom(s,data);
		s.add(top);
	}
	
	public static void reverseString( String data) {
		
		Stack<Character> s1= new Stack<>();
		for(int i=0;i<data.length();i++) {
			s1.push(data.charAt(i));
		}
	 StringBuilder g= new StringBuilder("");
	 while(!s1.isEmpty()) {
		 g.append(s1.pop());
	 }
		System.out.println(g.toString());
		
	}
	
	public static void main(String[] args) {
		reverseString("jaya");
	}
	
}

package DataStructures.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedParanthesis {
	
	static boolean isBalanced(String str) {
			
		Deque<Character> s= new ArrayDeque<>();
		for(int i=0;i<str.length();i++) {
			char c= str.charAt(i);
			if(c=='{' || c=='('  || c=='[') {
				s.push(c);}
			else if (s.isEmpty()==true) return false;
			else if (matching(s.peek(),c)== false) return false;
			else s.pop();			
			}	return (s.isEmpty()==true);
		}	

	static boolean matching(Character peek, char c) {
		return (
			(peek=='('  && c==')')  	|| 
			(peek=='{'  && c=='}')  	|| 
			(peek=='['  && c==']')  	
				
				);
	
		}
	
	
	
	public static void main (String[] args)
	{
		System.out.println(isBalanced("[[]]{}"));
	}
}

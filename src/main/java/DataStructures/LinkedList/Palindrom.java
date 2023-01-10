package DataStructures.LinkedList;

import java.util.ArrayDeque;
import java.util.Deque;


class Node3{
        char data;
        Node3 next;
        Node3(char x){
            data=x;
            next=null;
        }
    }

public class Palindrom {
	
	  public static void main(String args[]) 
	    { 
	        Node3 head=new Node3('g');
	    	head.next=new Node3('f');
	    	head.next.next=new Node3('g');
	    	if(isPalindrome(head))
	    	    System.out.print("Yes");
	    	else
	    	    System.out.print("No");
	    	
	    } 
	    
	    static boolean isPalindrome(Node3 head){
	        Deque<Character> stack=new ArrayDeque<Character>();
	        for(Node3 curr=head;curr!=null;curr=curr.next)
	            stack.push(curr.data);
	        for(Node3 curr=head;curr!=null;curr=curr.next){
	            if(stack.pop()!=curr.data)
	                return false;
	        }
	        return true;
	    }
	    
	    
	    //naive----------
	    
	    static boolean isPalindrome1(Node3 head){
	        Deque<Character> stack=new ArrayDeque<Character>();
	        for(Node3 curr=head;curr!=null;curr=curr.next)
	            stack.push(curr.data);
	        for(Node3 curr=head;curr!=null;curr=curr.next){
	            if(stack.pop()!=curr.data)
	                return false;
	        }
	        return true;
	    }

}

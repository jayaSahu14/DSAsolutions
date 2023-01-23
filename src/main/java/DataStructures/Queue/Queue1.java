package DataStructures.Queue;

import java.util.*;

public class Queue1 {

	public static void main (String[] args) {
         //Queue<Integer> q = new LinkedList<Integer>(); 
        Queue<Integer> q = new ArrayDeque<Integer>(); 
        
        q.offer(10); 
        q.offer(20); 
        q.offer(30); 
        
        System.out.println(q.size()); 
        System.out.println(q.isEmpty()); 
        System.out.println(q); 
        System.out.println(q.peek()); 
        System.out.println(q.poll()); 
        System.out.println(q.peek()); 
    } 
}

//poll() method of Queue Interface returns and removes the element at the front end of the container.
// It deletes the element in the container. The method does not throws an exception 
//when the Queue is empty, it returns null instead.


//offer is equal to add, and dont throw exception if full
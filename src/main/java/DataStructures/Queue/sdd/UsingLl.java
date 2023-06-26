package DataStructures.Queue.sdd;

import java.util.Stack;

public class UsingLl {
	
	static class Node {

	       int data;

	       Node next;

	       Node(int data) {

	           this.data = data;

	           next = null;

	       }

	   }


	   static class Queue {

	       static Node head = null;

	       static Node tail = null;


	       public static boolean isEmpty() {

	           return head == null && tail == null;

	       }


	       public static void add(int data) {

	           Node newNode = new Node(data);

	           if(isEmpty()) {

	               tail = head = newNode;

	           } else {

	               tail.next = newNode;

	               tail = newNode;

	           }

	       }


	       public static int remove() {

	           if(isEmpty()) {

	               System.out.println("empty queue");

	               return -1;

	           }

	           int front = head.data;

	           //single node

	           if(head == tail) {

	               tail = null;

	           }

	           head = head.next;

	           return front;

	       }


	       public static int peek() {

	           if(isEmpty()) {

	               System.out.println("empty queue");

	               return -1;

	           }

	         

	           return head.data;

	       }

	   }

	   public static void main(String args[]) {

	       Queue q = new Queue();

	       q.add(1);

	       q.add(2);

	       q.add(3);

	       q.add(4);

	       q.add(5);


	       while(!q.isEmpty()) {

	           System.out.println(q.peek());

	           q.remove();

	       }

	   }

	   // impl queue using 2 stack
	   
	   
	    	static class QueueB {

			   static class Queue {

			       static Stack<Integer> s1 = new Stack<>();

			       static Stack<Integer> s2 = new Stack<>();


			       public static boolean isEmpty() {

			           return s1.isEmpty();

			       }


			       public static void add(int data) {

			           while(!s1.isEmpty()) {

			               s2.push(s1.pop());

			           }

			           s1.push(data);

			           while(!s2.isEmpty()) {

			               s1.push(s2.pop());

			           }

			       }


			       public static int remove() {

			           return s1.pop();

			       }


			       public static int peek() {

			           return s1.peek();

			       }

			   }

			   public static void main(String args[]) {

			       Queue q = new Queue();

			       q.add(1);

			       q.add(2);

			       q.add(3);


			       while(!q.isEmpty()) {

			           System.out.println(q.peek());

			           q.remove();

			       }

			   }

			}


	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   

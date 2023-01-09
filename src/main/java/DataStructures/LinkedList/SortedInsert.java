package DataStructures.LinkedList;

import DataStructures.LinkedList.Node;

public class SortedInsert {
	
	 static Node insertAtPosition(Node head,int data){
		 
		 Node temp=new Node(data);
		 if(head==null) return temp;
		 if(head.data>data) {
			 temp.next=head;
			 return temp; }
		 Node curr = head;
		 while(curr.next != null && curr.next.data<data) {
			 curr=curr.next;
		 }
		 temp.next=curr.next;
		 curr.next=temp;
		 return head;
		 
		 // theta(n)
		 

    
	 
	 }
	 
}

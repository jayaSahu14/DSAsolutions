package DataStructures.LinkedList.DoublyLinkedList;

import DataStructures.LinkedList.DoublyLinkedList.Node;

public class InsertAtbegin {
	
	public static Node InsertatBegin1(Node head, int data)  {
		
		Node temp=new Node(data);
        temp.next=head;
        if(head!=null)head.prev=temp;
        return temp;

		
	}

}

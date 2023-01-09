package DataStructures.LinkedList;

public class HareTurtle {
	
	static boolean FloydCycle(Node head) {
		Node slow=head, fast=head;
		while(fast.next !=null && fast.next.next !=  null) {
			slow=slow.next;
			fast=fast.next;			
			if (fast==slow) return true;
		} return false;
	}

// delete node ptr 
static void deleteNode(Node ptr){
    Node temp=ptr.next;
    ptr.data=temp.data;
    ptr.next=temp.next;
}
}
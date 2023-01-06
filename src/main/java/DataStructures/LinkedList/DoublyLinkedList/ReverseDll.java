package DataStructures.LinkedList.DoublyLinkedList;

public class ReverseDll {

	public static Node Reverse(Node head)  {
		if(head==null || head.next==null) return head;
		Node prev=null, curr=head;
		while(curr != null) {
			prev=curr.prev;
			curr.prev=curr.next;
			curr.next=curr.prev;
			curr=curr.prev;
		}
		return prev.prev;
	}
	
	static Node delHead(Node head){   //delete head of doubly link list
        if(head==null)return null;
        if(head.next==null){
            return null;
        }    
        else{
            head=head.next; //make head.next as new head
            head.prev=null;
            return head;
        }
    }
	
	static Node delLast(Node head){   //delete head of doubly link list
		
		Node curr=head;
        while(curr.next!=null)
            curr=curr.next;
        curr.prev.next=null;
        return head;
		
    //  curr.nex= null --> last
    	// curr.next,next ---> sec last..make its next null
    	
//		
//		Node curr=head;
//		while(curr.next.next!=null) {
//			curr=curr.next;
//		}curr.next=null;
//		return head;


    }
	
	
	
	
	
	
	
	
	
}

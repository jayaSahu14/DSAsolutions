package DataStructures.LinkedList;

import java.util.ArrayList;

public class Reverse {
	
	//iterative
	
	public Node reverseLinked( Node head) {
		Node curr=head, prev=null;
		while(curr.next!=null) { 
			Node next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;			
		}return prev;	
	}
	
	static Node revList(Node head){
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(Node curr=head;curr!=null;curr=curr.next){
            arr.add(curr.data);
        }
        for(Node curr=head;curr!=null;curr=curr.next){
            curr.data=arr.remove(arr.size()-1);
        }
        return head;
    }
    

    static Node recRevL(Node head){ //recursive
        if(head==null||head.next==null)return head;
        Node rest_head=recRevL(head.next);
        Node rest_tail=head.next;
        rest_tail.next=head;
        head.next=null;
        return rest_head;
    }
    
    
    static Node recRevL(Node curr,Node prev){ //pass input: prev= null
        if(curr==null)return prev;
        Node next=curr.next;
        curr.next=prev;
        return recRevL(next,curr);
    }

}

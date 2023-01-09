package DataStructures.LinkedList;

public class ReverseInGroups {

	static Node reverseGroup(Node head, int k) {
		Node curr=head, next=null, prev=null;
		int count=0;
		while(curr!= null && count < k) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
			count++;
		} if(next!=null) {
			Node rest=reverseGroup(next,k);
			head.next=rest;
		} return prev;
		
	}
	
	static Node reverseK(Node head,int k){
        Node curr=head,prevFirst=null;
        boolean isFirstPass=true;
        while(curr!=null){
            Node first=curr,prev=null;
            int count=0;
            while(curr!=null&&count<k){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
            }
            if(isFirstPass){head=prev;isFirstPass=false;}
            else{prevFirst.next=prev;}
            prevFirst=first;
        }
        return head;
    }
	
}

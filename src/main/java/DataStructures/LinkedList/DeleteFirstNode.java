package DataStructures.LinkedList;

public class DeleteFirstNode {

	static Node deleteFirstNode(Node head) {
		  if(head==null)return null;
	        else{
	            return head.next;
	    }}
	
	static Node deleteLastNode(Node head) {
	
		Node curr=head;
		while(curr.next.next != null) {
			curr=curr.next; }
		curr.next=null;
		return head; 
	
	}
	
	static Node insertAtGivenPlace(Node head, int pos, int data) {
		Node temp=new Node(data);
		if(pos==1) {
			temp.next=head;
			return temp;
		}
		Node curr=head;
		for(int i=1;i<=pos-2 && curr!=null ;i++) {
			curr=curr.next;
		}
		if(curr==null) return head;
		temp.next=curr.next;
		curr.next=temp;
		return head;
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

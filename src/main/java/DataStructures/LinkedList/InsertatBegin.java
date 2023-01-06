package DataStructures.LinkedList;
	
public class InsertatBegin {
	
	public static Node InsertatBegin1(Node head, int n)    //head given here is head of ll
	{     		
		Node temp= new Node(n);
		temp.next=head;
		return temp;
	}
		 
	static Node insertEnd(Node head, int x){
		        Node temp=new Node(x);
		        if(head==null)return temp;
		        Node curr=head;
		        while(curr.next!=null){
		            curr=curr.next;
		        }
		        curr.next=temp;
		        return head;
		    }
	
	public static void main(String args[]) 
    { 
		Node head=null;
		head=InsertatBegin1(head,10);
		head=InsertatBegin1(head,20);
		head=InsertatBegin1(head,30);	
    }

}

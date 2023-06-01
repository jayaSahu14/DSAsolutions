package DataStructures.LinkedList;

import DataStructures.LinkedList.Impl.Node;

public class Delete {

	public static Node delete(Node head, int value) {
		
		if(head.data==value) {  // only 1 node
		return	 head=head.next;	 
		}
		
		Node temp=head;
		Node ahead=temp.next;
		
		while(ahead.next!=null) {			
  			 if(ahead.data==value) {
				temp=ahead.next;
						return head; 
			}
  			temp=ahead;	
			ahead=ahead.next;
				
		} 
		return head;
	}
	
	public static void print(Node head) {
		Node a=head;
    	while(a.next != null) {
    		System.out.println(a.data);
    	    a=a.next;   	
    	}    	
	}
	
	
	 public static void main(String[] args)
	    { 
	        Node head=new Node(10);
	    	Node temp1=new Node(20);
	    	Node temp2=new Node(30);
	    	Node temp3=new Node(40);
	    	Node temp4=new Node(50);
	    	Node temp5=new Node(60);
	    	Node temp6=new Node(70);
	    	
	    	head.next=temp1;
	    	temp1.next=temp2;
	    	temp2.next=temp3;
	    	temp3.next=temp4;
	    	temp4.next=temp5;
	    	temp5.next=temp6;
	    	temp6.next=null;
	    	
//	    	System.out.println(head.data);
//	    	System.out.println(head.next.data);
//	    	
	    print(head);
	    Node res=	delete(head,30);
	    System.out.println("-----");
	    print(res);
	    
	    	
	    	
	
}
}
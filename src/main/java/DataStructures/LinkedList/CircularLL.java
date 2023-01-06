package DataStructures.LinkedList;

public class CircularLL {
	
	 public static void main(String args[])  //impl
	    { 
	        Node head=new Node(10);
	    	head.next=new Node(5);
	    	head.next.next=new Node(20);
	    	head.next.next.next=new Node(15);
	    	head.next.next.next.next=head;
	    	printlist(head); 
	    }
	 
	 
// print circular linked list----------------------------------------------------------------------------------------------
	 
	 public static void printlist(Node head){  //while
	        if(head==null)return;
	        Node r=head;
	        do{
	            System.out.print(r.data+" ");
	            r=r.next;
	        }while(r!=head);
	    }
	 
	 public static void printlist1(Node head){   //for loop
	        if(head==null)return;
	        System.out.print(head.data+" ");
	        for(Node r=head.next;r!=head;r=r.next)
	            System.out.print(r.data+" ");
	    }
	 
//Insert at Begin of Circular Linked List ----------------------------------------------------------------------------------
	 
	 static Node insertBegin(Node head,int x){ //naive
		 Node temp= new Node(x);
		 if(head==null)
	            temp.next=temp;
	        else{
		 Node curr=head;
		 while (curr.next != head) {
			 curr=curr.next;
		 }
		 curr.next=temp;
		 temp.next=head;
	 } return  temp;
	 }
	 
	 
	 static Node insertBegin1(Node head,int x){ //efficient
		 
		        Node temp=new Node(x);
		        if(head==null){
		            temp.next=temp;
		            return temp;
		        }
		        else{
		            temp.next=head.next;  // temp.next ki value or head.next ki value same hui isse
		            head.next=temp;  //head.next ki value temp hui isse
		            int t=head.data;
		            head.data=temp.data;
		            temp.data=t;
		            return head;
		        }
		    }		 // insert data after head, and swap it with head's data

		 
// Insert at the end of Circular Linked List---------------------------------------------------------------------------		 
		 
	    static Node insertEnd(Node head,int x){
	        Node temp=new Node(x);
	        if(head==null){
	            temp.next=temp;
	            return temp;
	        }
	        else{
	            temp.next=head.next;
	            head.next=temp;
	            int t=head.data;
	            head.data=temp.data;
	            temp.data=t;
	            return temp;
	        }
	      //insert node after head, swap node2 with head, and increment head with +1
	    } 
		 
//Delete Head of Circular Linked List----------------------------------------------------------------
		 
		 
		 //eff: copy node2 value to node1...and delete node2 :: O(1)
	    static Node delHead1(Node head){
	        if(head==null)return null;
	        if(head.next==head)
	            return null;
	        head.data=head.next.data;
	        head.next=head.next.next;
	        return head;
	    }
	    
	    //naive: find last, make its next ref to node 2
	    static Node delHead(Node head){
	        if(head==null)return null;
	        if(head.next==head)
	            return null;
	        Node curr=head;
	        while(curr.next!=head)
	            curr=curr.next;
	        curr.next=head.next;
	        return (curr.next);
	    }
	 
	 
	  //Delete kth node of Circular Linked List----------------------------------------------------------------
	 
	    static Node deleteKth(Node head,int k){
	        if(head==null)return head;
	        if(k==1)return deleteHead(head);
	        Node curr=head;
	        for(int i=0;i<k-2;i++)
	            curr=curr.next;
	        curr.next=curr.next.next;
	        return head;
	    }
	    
	    static Node deleteHead(Node head){
	        if(head==null)return null;
	        if(head.next==head)
	            return null;
	        head.data=head.next.data;
	        head.next=head.next.next;
	        return head;
	    }
	 
	 
	
	   
	    
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

}

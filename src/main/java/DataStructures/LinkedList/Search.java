package DataStructures.LinkedList;

public class Search {

	 static int search(Node head, int x){  //recursive
		 if(head==null) return -1;
		 if(head.data==x) return 1;
		 else {
			 int res=search(head.next,x);
			 if(res==-1) return -1;
			 else return res+1;
		 }
	 }
	 
	 static int search1(Node head, int x){  //iterative
		int pos=1;
		Node curr=head;
        while(curr!=null){
            if(curr.data==x)
                return pos;
            else{
                pos++;
                curr=curr.next;
            }
        }
        return -1;
    }
		public static void main(String args[]) 
		{ 
		    Node head=new Node(10);
			head.next=new Node(20);
			head.next.next=new Node(30);
			printlist(head);
			System.out.println("Position of element in Linked List: "+search(head,20));
			
		} 
		
		public static void printlist(Node head){
		    Node curr=head;
		    while(curr!=null){
		    System.out.print(curr.data+" ");
		    curr=curr.next;
		}System.out.println();
}}
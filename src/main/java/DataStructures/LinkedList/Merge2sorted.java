package DataStructures.LinkedList;

public class Merge2sorted {

	 static Node sortedMerge(Node a,Node b){
	        if(a==null)return b;
	        if(b==null)return a;
	        Node head=null,tail=null;
	        if(a.data<=b.data){
	            head=tail=a;a=a.next;
	        }
	        else{
	            head=tail=b;b=b.next;
	        }
	        while(a!=null&&b!=null){
	            if(a.data<=b.data){
	                tail.next=a;tail=a;a=a.next;
	            }
	            else{
	                tail.next=b;tail=b;b=b.next;
	            }
	        }
	        if(a==null){tail.next=b;}
	        else{
	            tail.next=a;
	        }
	        return head;
	    }
	    
}

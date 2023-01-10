package DataStructures.LinkedList;

import java.util.HashSet;

import javax.print.attribute.HashAttributeSet;

public class Intersection {

	   static int getIntersection(Node head1, Node head2) 
	    { 
		   HashSet<Node> s= new HashSet<>(); 
		   Node curr=head1;
		   while(curr!=null) {
			   s.add(curr);
			   curr=curr.next;
		   }
		    curr=head2;
		    while(curr!=null) {
		    	if(s.contains(curr))
		    		return curr.data;
		    	curr=curr.next;
		    }
		    return -1;
		   
	    }

//--------------------------------------------------------------------------------------------
	   
	   int getNode() 
		{ 
			int c1 = getCount(head1); 
			int c2 = getCount(head2); 
			int d; 

			if (c1 > c2) { 
				d = c1 - c2; 
				return _getIntesectionNode(d, head1, head2); 
			} 
			else { 
				d = c2 - c1; 
				return _getIntesectionNode(d, head2, head1); 
			} 
		} 

		int _getIntesectionNode(int d, Node node1, Node node2) 
		{ 
			int i; 
			Node current1 = node1; 
			Node current2 = node2; 
			for (i = 0; i < d; i++) { 
				if (current1 == null) { 
					return -1; 
				} 
				current1 = current1.next; 
			} 
			while (current1 != null && current2 != null) { 
				if (current1.data == current2.data) { 
					return current1.data; 
				} 
				current1 = current1.next; 
				current2 = current2.next; 
			} 

			return -1; 
		} 
		int getCount(Node node) 
		{ 
			Node current = node; 
			int count = 0; 

			while (current != null) { 
				count++; 
				current = current.next; 
			} 

			return count; 
		} 





}


// intersection of 2 linked list
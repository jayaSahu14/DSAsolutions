package DataStructures.LinkedList;

import java.util.LinkedList;

public class Node {
	 int data;
     Node next;
     Node(int x){
         data=x;
         next=null;
     }

   public void ll() 
     {
         LinkedList<String> ll = new LinkedList<>();
  
         ll.add("Geeks");
         ll.add("Geeks");
         ll.add(1, "Geeks");
  
         System.out.println("Initial LinkedList " + ll);
  
         ll.set(1, "For");
  
         System.out.println("Updated LinkedList " + ll);
     }

}


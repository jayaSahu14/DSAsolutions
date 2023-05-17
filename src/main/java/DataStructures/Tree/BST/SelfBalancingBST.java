package DataStructures.Tree.BST;

import java.util.Iterator;
import java.util.TreeSet;

public class SelfBalancingBST {
	
	  public static void main(String[] args) {
	
	// Creating an empty TreeSet
    TreeSet<String> s = new TreeSet<String>();

    // Elements are added using add() method
    s.add("gfg");
    s.add("courses");
    s.add("ide");
    
    // Displaying the TreeSet
    // in sorted order
    System.out.println(s);
    
    // Checking whether "ide" is present 
    // or not
    System.out.println(s.contains("ide"));
    
    // Iterator to traverse the TreeSet
    Iterator<String> i = s.iterator();
    while(i.hasNext())
        System.out.println(i.next());
    
    
    // Removing 5 from TreeSet
    s.remove(5);
    
    // foreach way of traversal -----
    for(String x:s)
        System.out.print(x + " ");
    
    
    //-----------------------------------------------------------------
    
    
    // Prints the largest value lower than 5
    // Here it is 2
//    System.out.println(s.lower(5));
//    
//    // Prints the smallest higher value than 5
//    // Between 10 and 15 smallest is 10
//    System.out.println(s.higher(5));
//    
//    // Value <= 5
//    System.out.println(s.floor(5));
//    
//    // Value >= 5
//    System.out.println(s.ceiling(5));
//    
    
    
    // tresset uses redblack tree
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
}
//treeset = self bst
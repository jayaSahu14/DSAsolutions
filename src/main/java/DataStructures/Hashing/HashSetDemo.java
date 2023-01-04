package DataStructures.Hashing;
import java.util.*; 

public class HashSetDemo {

	// Java program to demonstrate 
	// working of HashSet 
	public static void main(String[]args) 
	    { 
	        HashSet<String> h = new HashSet<String>(); 

	        
	        h.add("gfg"); 
	        h.add("courses"); 
	        h.add("ide"); 

	      
	        System.out.println(h);
	        
	        
	        System.out.println(h.contains("ide"));
	        
	       
	        Iterator<String> i = h.iterator();
	        
	        while(i.hasNext())
	        {
	            System.out.print(i.next()+" ");
	        }
	        
	        System.out.println(h.size());
	        
	        h.remove("ide");
	        System.out.println(h.size());
	        
	        for(String s: h)
	        {
	            System.out.print(s+" ");
	        }
	        
	        
	        
	        System.out.println("\n"+h.isEmpty());
	        
	    } 
	} 

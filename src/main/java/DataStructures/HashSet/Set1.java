package DataStructures.HashSet;

import java.util.HashSet;

public class Set1 {
	public static void main(String[] args) {
		

	HashSet<Integer> hs= new HashSet<>();
	hs.add(1);
	hs.add(2);
	hs.add(5);
	hs.add(4);
	hs.add(4);
	
	System.out.println(hs);
	System.out.println("-----");
	System.out.println(hs.contains(1));System.out.println("-----");
	System.out.println(hs.remove(4));  System.out.println("-----");
	System.out.println(hs);
}
}
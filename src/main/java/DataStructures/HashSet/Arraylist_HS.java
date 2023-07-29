package DataStructures.HashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class Arraylist_HS {

	public static void main(String[] args)
	{
	
		// adding elements to ArrayList object
		ArrayList<String> gfg = new ArrayList<>();
		

		gfg.add("data structure");
		gfg.add("competitive programming");
		gfg.add("Interviews");
		gfg.add("FANG");
		gfg.add("FANG");

		// pass ArrayList object into the HashSet object
		// constructor
		HashSet<String> hashSet = new HashSet<>(gfg);

		// printing every element in Set

		for (String value : hashSet) {
			System.out.println(value);
		}
	}
	
}
// arraylist to hashset



//   Integer max = Collections.max(intValues); --max func in collection, arraylist

/*   Integer intobject = new Integer(68);
 
        // Returns the value of this Integer as an int
        int i = intobject.intValue();
 */


package main.lambda.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Fm {


	public static void main(String[] args) {
		
		//map()
		
		List<Integer> list1=Arrays.asList(1,2,3,4,5,6);
		List<Integer> list2= list1.stream().map(n->n+10).collect(Collectors.toList());
		System.out.println(list2); //[11, 12, 13, 14, 15, 16]
		
		//flatMap()
		List<Integer> lst1=Arrays.asList(1,2);
		List<Integer> lst2=Arrays.asList(3,4);
		List<Integer> lst3=Arrays.asList(5,6);
		
		
		List<List<Integer>>finallist=Arrays.asList(lst1,lst2,lst3);
		
		List<Integer> finalresults=finallist.stream().flatMap(x->x.stream().map(n->n+10)).collect(Collectors.toList());
		
		System.out.println(finalresults);
		
		

	}

	
	/*Both of the functions map() and flatMap are used for
	 *  transformation and mapping operations.
	 *   map() function produces one output for one input value, 
	 *   whereas flatMap()
	 *  function produces an arbitrary no of values as output 
	 *  (ie zero or more than zero) for each input value.
	 */
}

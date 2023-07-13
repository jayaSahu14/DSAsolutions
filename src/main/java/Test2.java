import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Test2 {

	public static void main(String[] args) {
		
	List<Integer> list=Arrays.asList(10,15,8,49,25,98,98,32,15);
		int[] arr= {10,15,8,49,25,98,98,32,15};
		HashSet<Integer> hs= new HashSet<>();
		HashSet<Integer> hs1= new HashSet<>();
		HashSet<Integer> hs2= new HashSet<>();
		
		HashMap<Integer, Integer> hm= new HashMap<Integer,Integer>(); // count freq of each element
		for(int i:arr) {
			hm.put(i, hm.getOrDefault(i,0)+1);
		} System.out.println("direct print map"+hm); // print freq
		
		System.out.println("------all key val pair-------");
		for( Entry<Integer, Integer> entry : hm.entrySet() ){
			//-----any condition ----if(entry.getValue() ==2)  // get value chks for value in k:v
		    System.out.println( entry.getKey() + " = " + entry.getValue() );
		  
		} 
	
		System.out.println("-------printing all keys using entryset");

		for( Entry<Integer, Integer> entry : hm.entrySet() ){
			  System.out.println( entry.getKey());
		}
		
		System.out.println("-------printing all value using entryset");
		for( Entry<Integer, Integer> entry : hm.entrySet() ){
		    System.out.println( entry.getValue() );}
		
		
System.out.println("-------------");
		
			
      // show all keys of hashmap 
		 System.out.println("all keys  of map in set"+ hm.keySet());
				 
		// show all values of hashmap 
				for(int val : hm.keySet()){
				    hs1.add(hm.get(val));
				}
			    System.out.println("all values  of map in set"+hs1);
			    //direct
				 System.out.println("all val  of map in set"+ hm.values());

		
	   

		System.out.println("------dup elements-------");
		list.stream().filter(n -> !hs.add(n)).forEach(System.out::println);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}


//How to find duplicate elements in a given integers list in java using Stream functions?
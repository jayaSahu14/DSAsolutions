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
		
		HashMap<Integer, Integer> hm= new HashMap<Integer,Integer>();
		for(int i:arr) {
			hm.put(i, hm.getOrDefault(i,0)+1);
		} System.out.println(hm); // print freq
		
		System.out.println("------KEY VALUE-------");
		for( Entry<Integer, Integer> entry : hm.entrySet() ){
			if(entry.getValue() ==2) {
		    System.out.println( entry.getKey() + " = " + entry.getValue() );
		    System.out.println( entry.getKey()  );
		    System.out.println( entry.getValue() );}
		} 
		
		System.out.println("-------------");
		for(Integer keys : hm.keySet()){
		    System.out.println( keys );
		}
		System.out.println("-------------");
		list.stream().filter(n -> !hs.add(n)).forEach(System.out::println);
	}

}


//How to find duplicate elements in a given integers list in java using Stream functions?
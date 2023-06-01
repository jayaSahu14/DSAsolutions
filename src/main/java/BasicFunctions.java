import java.util.Map;

public class BasicFunctions {

	//String------------------------------------------------
	String s1="java string split method by javatpoint";  
	String[] words=s1.split(" ");
	for(String w:words){  
	System.out.println(w);  
	}  
	}
	
	


class HashMapFunc{
	
// To show the key-value pair ie element (key) and its count (value)    
for(Map.Entry<Integer, Integer> entry :  map.entrySet()){
        System.out.println( entry.getKey() + " => " + ": " + entry.getValue() );
 }

// get or default is, if no value is there, return 

map.put("b", 200);
int k = map.getOrDefault("b", 500);
containsKey
put
	
	/
	Map<String, Integer> map = new HashMap<>();
	map.put("a", 1);
	map.put("b", 2);
	System.out.println(Arrays.asList(map)); // method 1
	System.out.println(Collections.singletonList(map)); 
	
	map.forEach((key, value) -> System.out.println(key + " " + value));
	HashMap<K,V> HM = new HashMap<>(); //empty
	System.out.println(HM);
	
}

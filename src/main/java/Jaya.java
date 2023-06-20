import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Jaya {

	public static void main(String[] args) {
		
		HashMap<Integer,Integer> hm= new HashMap<>();
		hm.put(1,1);
		hm.put(2, 2);
		
		System.out.println(hm);
		
		for(Entry<Integer, Integer>e:hm.entrySet()) {
			System.out.println(e.getKey()+"-"+e.getValue());
		}
		
		int a=1;int b=2;
		a=a^b; System.out.println("a"+a);
		b=a^b;System.out.println("b"+b);
		a=a^b;System.out.println("a"+a);


	}
}

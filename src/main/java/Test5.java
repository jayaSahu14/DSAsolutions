import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Test5 {

	public static void main(String[] args) {


		List<Integer> list= Arrays.asList(1,2,3,4,5);
		List<Integer> list1= Arrays.asList(1,2,3,4,5,6);
		HashSet<Integer> hs= new HashSet<>();
		hs.addAll(list);
		hs.addAll(list1);
		System.out.println(hs);
		
		HashMap<Integer,Integer> hm= new HashMap<>();
		//
		// add both list values to hm, print if getValue=2;
		
		list.stream().filter(s-> s==5)(System.out::print());
		

	}

}

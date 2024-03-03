import java.util.HashMap;
import java.util.Map.Entry;

public class testt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,4,2,5,2,3,3,9};
		HashMap<Integer,Integer> hm= new HashMap<>();
		for(int i: arr) {
			hm.put(i, hm.getOrDefault(i,0)+1);
		}
		//System.out.println(hm);
		
		for(Entry<Integer,Integer> e: hm.entrySet()) {
			if(e.getValue()>1) {
				System.out.println(e.getKey());
			}
		}
		
		
		
		
	}}


//idx of 2 , 3 and values
// find all dups and index of dubs in unsorted array

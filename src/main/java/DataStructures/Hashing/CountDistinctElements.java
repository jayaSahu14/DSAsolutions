package DataStructures.Hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set; // dups not allowed

public class CountDistinctElements {

	  public static void main (String[] args) {
	        int arr[] = new int[]{15, 16, 27, 27, 28, 15};
	        int n = arr.length;
	        
	        System.out.println(countDistinct(arr, n));
	    }
	    
	    static int countDistinct(int arr[], int n)
	    {
	        Set<Integer> hs = new HashSet<Integer>();
	        for(int i = 0; i < n; i++)
	          hs.add(arr[i]);
	    
	       return hs.size();        
	    }
	    
	    static int countDistinct1(int arr[], int n) {
	    HashMap<Character, Integer> cnt = new HashMap<>();
		for (char c: s.toCharArray()) {
			cnt.put(c, cnt.getOrDefault(c, 0) + 1);
		}}



}

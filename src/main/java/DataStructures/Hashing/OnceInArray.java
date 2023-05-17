package DataStructures.Hashing;

import java.util.HashMap;
import java.util.Map;

public class OnceInArray {
	
	 static void occurredOnce(int[] arr, int n)
	    {
		 HashMap<Integer,Integer> mp= new HashMap<>();
		 
		 for(int i=0;i<n;i++) {
			 if(mp.containsKey(arr[i])) {
				 mp.put(arr[i], 1+ mp.get(arr[i]));
			 }else
				 mp.put(arr[i], 1);
		 }
		 for (Map.Entry entry : mp.entrySet())
         {
             if (Integer.parseInt(String.valueOf(entry.getValue())) == 1)
                 System.out.print(entry.getKey() + " ");
         }}
		 
		 public static void main(String args[])
		    {
		            int[] arr = { 7, 7, 8, 8, 9, 1, 1, 4, 2, 2 };
		            int n = arr.length;
		 
		            occurredOnce(arr, n);
		            
		            
		    }
		 
	    }



package DataStructures.Hashing.probs;

import java.util.HashSet;
import java.util.Set;

public class one {

	 // Function to check if there is a pair with the given sum in the array.
    public static int sumExists(int arr[], int N, int sum) {
        // Your code here, Geeks
       Set<Integer>hs=new HashSet<>();
     boolean flag=false;
     for(int x:arr){
         if(hs.contains(sum-x))
         flag= true;
         else 
         hs.add(x);
     }
     if(flag)
         return 1;
         else 
         return 0;
    }
	
	
}

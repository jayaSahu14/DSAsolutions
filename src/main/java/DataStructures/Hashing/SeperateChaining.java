package DataStructures.Hashing;

import java.util.ArrayList;

public class SeperateChaining {
	
	 public ArrayList<ArrayList<Integer>> separateChaining(int arr[], int n, int hashSize)
	    {
	        ArrayList<ArrayList<Integer>> table;
	        table = new ArrayList<ArrayList<Integer>>();
	       for(int i=0;i<=hashSize;i++){
	           table.add(new ArrayList<Integer>());
	       }
	       for(int i=0;i<n;i++){
	           table.get(arr[i]%hashSize).add(arr[i]);
	       }
	       return table;
	    }

}

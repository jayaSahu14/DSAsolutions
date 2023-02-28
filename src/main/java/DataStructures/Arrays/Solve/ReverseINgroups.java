package DataStructures.Arrays.Solve;

import java.util.ArrayList;

public class ReverseINgroups {
	 void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
	        
	        int i=0;
	        while(i<n)
	        {
	          int left=i;
	          int right=Math.min(n-1,i+k-1) ;
	          while(left<right)
	          {
	            int temp=arr.get(left);
	                arr.set(left,arr.get(right));
	                arr.set(right,temp);
	            left++;
	            right--;
	            
	          }
	          i=i+k;
	        }
	    }
}

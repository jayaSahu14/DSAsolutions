package DataStructures.Arrays.Basic;

public class WindowSliding {
	
     public  int ws(int arr[], int k)
       {
    	   int size=arr.length; int curr=0; int res=0;
    	   for(int i=0;i<k;i++) 
    	   {
    		   curr+=arr[i];
    		   res=curr;
    	   }
    	   for(int i=k;i<size;i++) { 
    		  curr= curr+ arr[i]-arr[i-1];
    		  res=Math.max(res, curr);	
    		  
    	   }
    	   return res;	   
  }

}
//max value of sum of sub array of size k, by adding upto k elements, and subtracting 1st element, and adding
//next element

/*
 class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) { n=size, s=sum
        ArrayList<Integer> idx = new ArrayList<Integer>();
        int start = 0, end = 0, sum = arr[0];
        if(s==0){
            idx.add(-1); // Indicates no subarray found
            return idx;
        }
    
    
        while (end < n) {
            if (sum == s) {
                idx.add(start + 1);
                idx.add(end + 1);
                return idx;
            } 
            // for last index
            else if (sum < s) {
                end++;
                if (end < n) {
                    sum += arr[end];
                }
            } 
            // for start index
            else {
                sum -= arr[start];
                start++;
            }
        }
    
        idx.add(-1); // Indicates no subarray found
        return idx;
    }

}
 */












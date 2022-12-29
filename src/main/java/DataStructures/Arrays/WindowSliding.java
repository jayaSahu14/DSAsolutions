package DataStructures.Arrays;

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
package Leetcode.resursion;

public class ONE {
	
	static long findGoodPairs(int a[], int n, int k){
	       int pair=0,c=0;
	       for(int i=k;i<n;i++){       
	        	   if(a[i]==a[i-k]) 
	        		   System.out.println(a[i]+""+a[i-k]);
	        		   c=c+1;
	        		   pair++;
	        	   
	        	  
	        	       
	        	  
	       }
	       return pair;
	    }
	 
	public static void main(String args[]) 
    { 
       int arr[] = {1,1,1,1}, n = 4,k=1;
       System.out.println("ans"+findGoodPairs(arr, n,k));
    } 

	/* for(int i=0;i<n-k;i++){
	          for(int j=i+k;j<n;j++) {
	        	   if(a[i]==a[j])
	        	          pair++;
	        }
	       }
	       return pair;
	    }  */

}

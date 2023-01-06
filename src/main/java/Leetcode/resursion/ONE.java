package Leetcode.resursion;

public class ONE {
	
	static long findGoodPairs(int a[], int n, int k){
	       int pair=0;
	       for(int i=0;i<n-k;i++){       
	        	   if(a[i]==a[i+k])  
	        	     System.out.println("i: "+a[i]+"          i+k :"+a[i+k]);	 
	        		   pair++; 
	       }
	       return pair;
	    }
	 
	public static void main(String args[]) 
    { 
       int arr[] = {1,2,2,1,2,1}, n = 6,k=2;
       System.out.println("ans:"+findGoodPairs(arr, n,k));
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

package DataStructures.Sorting;

import java.util.Arrays;

public class MinDifference {

	    static int getMinDiff(int arr[], int n){  //effieicent
	       
	    	Arrays.sort(arr);	        
	        int res = Integer.MAX_VALUE;
	        for(int i = 1; i < n; i++){
	            res = Math.min(res, arr[i] - arr[i-1]);
	        }
	        return res;
	    }
	    
	    
	    static int getMinDif(int arr[], int n){ //naive
	        int res = Integer.MAX_VALUE;
	        for(int i = 1; i < n; i++){
	            for(int j = 0;j < i;j++){
	                res = Math.min(res, Math.abs(arr[i] - arr[j]));
	            }
	        }
	        return res;
	    }
	    
		public static void main (String[] args) {
			
			int arr[] = new int[]{8,4,7,9,2,11,15};
			int n=arr.length;
			System.out.println("efficient:" +getMinDiff( arr, n));
			System.out.println("naive:" +getMinDif(arr, n));
		}
	}

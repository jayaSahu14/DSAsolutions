package StriverDP;

import java.util.Arrays;

public class Fibboaci {
	
	// fibonaci no. at nth place
	
	public static void main(String args[]) {

		  int n=6;
		  int dp[]=new int[n+1];
		  Arrays.fill(dp,-1);
		  System.out.println(fibb(n,dp));
		  
		}

	private static int fibb(int n, int[] dp) {
		if(n<=1) return n; // for 0,1
	    if(dp[n]!= -1) return dp[n];
	    return dp[n]= fibb(n-1,dp)+ fibb(n-2,dp);

	}

}

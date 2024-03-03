package lb;

import java.util.Arrays;

public class RodCutt {
	
	public static int solve(int n, int x, int y, int z) {
		if(n==0) return 0;
		if(n<0) return Integer.MIN_VALUE;
		
		int a= solve(n-x,x,y,z)+1;
		int b= solve(n-y,x,y,z)+1;
		int c= solve(n-z,x,y,z)+1;
		
		int ans= Math.max(a, Math.max(c, b));
		if (ans< 0) return 0;
		else
			return ans;
	}
	

	public static int solveMemo(int n, int x, int y, int z, int[]dp) { // dp size n+1
		if(n==0) return 0;
		if(n<0) return Integer.MIN_VALUE;
		
		int a= solveMemo(n-x,x,y,z, dp)+1;
		int b= solveMemo(n-y,x,y,z, dp)+1;
		int c= solveMemo(n-z,x,y,z, dp)+1;
		
		if(dp[n] != -1) return dp[n];
		dp[n]= Math.max(a, Math.max(c, b));
		return dp[n];
	}
	
	
	public static int solveTab(int n, int x, int y, int z) {// dp size n+1
	
     	int dp[]= new int[n+1];
     	Arrays.fill(dp, Integer.MIN_VALUE);
     	
     	dp[0]=0;
     	
     	for(int i=1;i<n;i++) {
     		int a= solveTab(i-x,x,y,z)+1;
    		int b= solveTab(i-y,x,y,z)+1;
    		int c= solveTab(i-z,x,y,z)+1;
     		
     	}
     	
     
	
	}
	
	public	static int maxCuts(int n, int a, int b, int c) 
	{ 
		int dp[]= new int[n+1];
		dp[0] =0;
		
		for(int i = 1; i<=n; i++){
		        	dp[i] = -1;

			if(i-a >=0) dp[i] = Math.max(dp[i],dp[i-a]);
			if(i-b >=0) dp[i] = Math.max(dp[i],dp[i-b]);
			if(i-c >=0) dp[i] = Math.max(dp[i],dp[i-c]);

			if(dp[i]!=-1)
				dp[i]++;
		}
		return dp[n];
	} 


}

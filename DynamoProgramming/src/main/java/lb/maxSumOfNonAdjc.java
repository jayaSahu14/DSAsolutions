package lb;

import java.util.Arrays;

public class maxSumOfNonAdjc {
	
	public void maxSumOfNonAdjc1(int[] arr) {
		int n= arr.length;
		int ans= solve(arr, n-1);
	}

	private int solve(int[] arr, int n) {
		 if(n<0) return 0;
		 if(n==0) return arr[0];
		
		 int incl=solve(arr, n-2)+ arr[n];
		 int excl=solve(arr, n-1)+ 0;
 
		return Math.max(incl, excl);
	}
	
	private int solve2(int[] arr, int n, int[] dp) { // dp of size n, with -1 values
		 if(n<0) return 0;
		 if(n==0) return arr[0];
		
		 int incl=solve(arr, n-2)+ arr[n];
		 int excl=solve(arr, n-1)+ 0;

		 if(dp[n]!=-1) return dp[n];
		 
		return dp[n]=Math.max(incl, excl);
	}

	private int solve3(int[] arr, int n) {
		int[] dp= new int[n];
		Arrays.fill(dp, 0);
		
		dp[0]=arr[0];
		
		 if(n<0) return 0;
		 if(n==0) return arr[0];
		 
       	for(int i=1;i<n;i++) {	
		 int incl=solve(arr, i-2)+ arr[i];
		 int excl=solve(arr, i-1)+ 0;
		 
		 dp[i]=Math.max(incl, excl);
	}
		return dp[n-1];
	}
	
	private int optimised(int[] arr, int n) {
		int[] dp= new int[n];
		Arrays.fill(dp, 0);

		int prev2=0;
		int prev=arr[0];

		if(n<0) return 0;
		if(n==0) return arr[0];

		for(int i=1;i<n;i++) {	
			int incl=prev2+ arr[i];
			int excl=prev;
			int ans=Math.max(incl, excl);

			prev2=prev;
			prev=ans;
		}
		return dp[n-1];
	}
	
	
	
	
	
	
	
	
	
}
/* include i=i+2,  exclude, i=i+1
 * 
 * 
 * 
 * 
 * /
 */
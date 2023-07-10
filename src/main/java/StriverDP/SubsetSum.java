package StriverDP;

public class SubsetSum {

	static Boolean isSubsetSum(int n, int set[], int sum){
	       boolean dp[]=new boolean[sum+1];
	       dp[0]=true;
	       
	       for(int i=0;i<n;i++)
	       for(int s=sum;s>=0;s--)
	       {
	           if(s>=set[i])
	           dp[s]=dp[s]||dp[s-set[i]];
	       }
	       return dp[sum];
	    }
}

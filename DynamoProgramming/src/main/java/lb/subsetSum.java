package lb;

public class subsetSum {
	
	public static int countSubsetsWithSum(int[] arr, int target) {
	    int n = arr.length;
	    int[][] dp = new int[n + 1][target + 1];
	    
	    // Initialize base cases
	    for (int i = 0; i <= n; i++) {
	        dp[i][0] = 1;
	    }
	    
	    for (int i = 1; i <= n; i++) {
	        for (int j = 1; j <= target; j++) {
	            if (j >= arr[i - 1]) {
	                dp[i][j] = dp[i - 1][j] + dp[i - 1][j - arr[i - 1]];
	            } else {
	                dp[i][j] = dp[i - 1][j];
	            }
	        }
	    }
	  
	    return dp[n][target];
	}

public static void main(String[] args) {
	int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9}; int t=19;
	int ans=countSubsetsWithSum(arr,t);
	System.out.println(ans);
}	


}

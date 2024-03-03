package lb;

public class Knapcak01 {

	public static int solve(int[] weight, int[] value, int index, int capct) {
		
		if(index==0) {
			if( weight[0] <= capct) return value[0];	
			else return 0;
			}
		
		int include=0;
		if(weight[index]<=capct) {
			  include= value[index] + solve(weight,  value,  index-1,  capct-weight[index]);
			  }
			
		int exclude= 0+ solve(weight,  value,  index-1,  capct);		
		int ans=Math.max(include, exclude);		
			return ans;		
	}
	
	public static int solvedp(int[] weight, int[] value, int index, int capct, int dp[][]) {
		
		if(index==0) {
		     	if( weight[0] <= capct) return value[0];	
			   else return 0;
			}
		
		if(dp[index][capct] != -1) return dp[index][capct];
		
		int include=0;
		if(weight[index]<=capct) {
			  include= value[index] + solvedp(weight,  value,  index-1,  capct-weight[index], dp);
			  }
			
		int exclude= 0+ solvedp(weight,  value,  index-1,  capct, dp);		
		dp[index][capct]=Math.max(include, exclude);		
			return dp[index][capct];		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int knap(int[] weight, int[] value, int n, int maxw) {
		return  solve(weight, value, n-1, maxw);
		
		//int dp[][] = new int[n][maxw+1]; dp,fill(-1);
	}
	
	
	
	
}

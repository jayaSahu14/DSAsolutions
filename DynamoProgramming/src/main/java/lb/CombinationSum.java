package lb;

public class CombinationSum {
	
	public int solve(int[] num, int target) {
		
		if(target<0) return 0;
		if(target==1) return 1;
		
		int ans=0;
		
		for(int i=0; i< num.length;i++) {
			ans += solve(num, target-num[i]);
		}
		return ans;
		
	}
	
	
	public int combSum(int[] num, int target) {
		
		return target;

		}
}

// number f ways u can make target
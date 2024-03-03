package lb;

public class Dearrangements {

	public void dearr(int n) {
		
		
		
	}
	
public int solve(int n) {
		
	if(n==1) return 1;
	if (n==0) return 1;
	
	int ans= (n-1)* solve(n-1);
		
	return ans;
		
	}
	
}

/* 
    f(n)=(n-1)*[ f(n-2]+ f(n-1) ] 
 */
 
 
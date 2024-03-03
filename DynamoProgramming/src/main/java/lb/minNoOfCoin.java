package lb;

public class minNoOfCoin {

	public void minNoOfCoin(int[] arr, int x) {
		
	}
	
	public int recursion(int[] num, int x) {
		if(x==0) {return 0;}
		if(x<0) {return Integer.MAX_VALUE ;}
		
		int min= Integer.MAX_VALUE ;
		for(int i=0;i<num.length;i++) {
			int ans= recursion(num, x-num[i]);
			if(ans!=  Integer.MAX_VALUE ) {
				min= Math.min(min, 1+ans);
			}
		}
		return min;
		
		
		
	}
	
	
}

package DataStructures.DynamicProgramming;

public class PalindromSubseq {
	
	public int lps(String str, int n) {
		if(str=="") return 0;
		
		boolean arr[][]= new boolean[n][n];
		int maxlps=1;
		
		for(int i=0;i<str.length();i++) {
			arr[i][i]=true;
		}
		
		for(int i=n-2;i>0;i--) {
			for(int j=i+1;j<n;j--) {
				   if(str.charAt(i) == str.charAt(j)) {
					   
					   if(arr[i+1][j-1] || j-i==1) {
						   arr[i][j]=true;
						   maxlps=Math.max(maxlps, j-i+1);
					   }
					   
				   }
			}
		}return maxlps;
		
	}

}

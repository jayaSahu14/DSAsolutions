package Greedy;

import java.util.Arrays;

public class AbsoluteDiff {
	
	public static void main(String[] args) {
		int[] a1= {4,1,8,7};
		int[] a2= {2,3,6,5};
		
		int ans=absDiff(a1,a2);
		System.out.println(ans);
		
		}
	
	
	public static int absDiff(int[]arr1, int[] arr2) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		int minDiff=0;
		
		for(int i=0;i<arr1.length;i++) {
			minDiff +=Math.abs( arr1[i]- arr2[i]);
		}
		return minDiff;
	}

}

package DataStructures.Arrays.Solve;

public class MaxDiffIndex {

	static int maxIndexDiff(int A[], int N) { 

     int maxind=Integer.MIN_VALUE;
	     for(int i=0;i<N;i++)
	     {
	         for(int j=N-1;j>=0;j--)
	         {
	             if(A[i]<=A[j])
	             {
	                 int temp=j-i;
	                 maxind=Math.max(temp,maxind);
	                 break;                
	             }
	         }
	     }
	     return maxind;
	    }
}

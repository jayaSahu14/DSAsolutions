package DataStructures.Arrays;

public class MaximumSubarraySum {
	
	static int maxSum(int arr[],int n) {
		int res= arr[0];
		int maxEnd=arr[0];
		for(int i=1;i<n;i++) {
			maxEnd=Math.max(maxEnd+arr[i], arr[i]);
			res=Math.max(maxEnd, res);
		}
	return res;	
	}
	
	public static void  main(String args[]) 
    {  
	 
	 int arr1[]={5,5,8,20,15,15,15,16};
	int arr2= maxSum(arr1,8);
	
		System.out.print(arr2);
    }
	 
	 
	

}

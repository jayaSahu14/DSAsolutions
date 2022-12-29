package DataStructures.Searching;

public class Count1 {

	static int countOcc(int arr[], int size, int x)
	{
		int low=0,high=size-1, index = 0;
		
		while(low<=high) {  
			int mid=(low+high)/2;
			if(x>arr[mid]) {low=mid+1;}
			else if(x < arr[mid]) {high = mid - 1;}	
			else if(x==arr[mid]) { 
				if(mid==0  || arr[mid]!=arr[mid-1]) {
					index= arr[mid];
					return (size-mid);
				} else high=mid-1;
			}
	}
//		int res=high-index;
//		System.out.println(res);
		return 0;
}
	

	public static void main(String args[]) 
    {
        int arr[] = {0,0,1,1,1,1,1}, n = 7;		
		int s=countOcc(arr, n, 1);
		System.out.println(s);


    } 



}

// find ist index of 1 and subtract it by size
//  find 1st 1 by bin search,
// if it is in mid, look prevoius is 1, if yes, repeat whole process
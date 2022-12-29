package DataStructures.Searching;

public class SquareRoot {

	static int sqRootFloor(int x)
	{
		int low = 1, high = x, ans = -1;

		while(low <= high)
		{
			int mid = (low + high) / 2;

			int mSq = mid * mid;
			if(mSq == x)
				return mid;
			else if(mSq > x)
				high = mid - 1;
			else
			{
				low = mid + 1;
				ans = mid;
			}
		}

		return ans;
	}

	public static void main(String args[]) 
    {
		System.out.println(sqRootFloor(10));
    } 

}

/*
int x, ans=-1;
int low=1, high=n;
while(low<high) {
	mid=high+low/2;
	
	if(mid*mid)=x. ==> return x;
	if m*m >x;
	 high=mid-1
	if (m*m)<x; 	 low=mid +1; ans=mid;	 
	

}
}

*/





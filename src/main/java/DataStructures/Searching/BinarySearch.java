package DataStructures.Searching;

public class BinarySearch {

	//iterative
	
		static int bSearch(int arr[], int size, int x)
		{
			int low = 0, high = size - 1;

			while(low <= high)
			{
				int mid = (low +( high-low) )/ 2;
				if(arr[mid] == x)
					return mid;
				else if(arr[mid] > x)
					high = mid - 1;
				else
					low = mid + 1;
			}
			return -1;
		}  //Time Complexity: O(log n) ||| Auxiliary Space: O(1)
		
//recursive-----------------------------------------------------------------------------------------------

		
		static int b2Search(int arr[], int low,int high, int x)
		{
			
		   int mid = (low + high) / 2;
		   if(low>high) return -1;
		   if (arr[mid]==x) return arr[mid];
		   else 
			   if (arr[mid]>x) {
			     return b2Search(arr,low,mid-1,x);}
		   else 
			     return b2Search(arr,mid+1,high,x);
   
		   
		
	//Time Complexity: O(log n) |||| Auxiliary Space: O(log n)		   
	}
		
		
		public static void main(String args[]) 
	    {
	        int arr[] = {10, 20, 30, 40, 50, 60}, n = 6;
			int x = 25;
			int y=30;
	        System.out.println(bSearch(arr, n, x));
	        System.out.println(b2Search(arr, 0, n, y));
			
	    } 
	}

/*    gfg code

    static int b3Search(int arr[], int low, int high, int x)
			{
				if(low > high)
					return -1;

				int mid = (low + high) / 2;

				if(arr[mid] == x)
					return mid;

				else if(arr[mid] > x)
					return bSearch(arr, low, mid - 1, x);

				else
					return bSearch(arr, mid + 1, high, x);
			}
 * */

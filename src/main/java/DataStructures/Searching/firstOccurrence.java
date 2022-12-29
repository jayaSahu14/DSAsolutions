package DataStructures.Searching;

public class firstOccurrence {

	static int firstOcc(int arr[], int n, int x) //iterative
		{
			int low = 0, high = n - 1;
			while(low <= high)
			{
				int mid = (low + high) / 2;
				if(x > arr[mid])
					low = mid + 1;
				else if(x < arr[mid])
					high = mid - 1;
				else
				{
					if(mid == 0 || arr[mid - 1] != arr[mid])
						return mid;
					else
						high = mid - 1;
				}
			}
			return -1;
		}
		
	
//recursive
			static int firstOcc(int arr[], int low, int high, int x)
			{
				if(low > high)
					return -1;
				int mid = (low + high) / 2;
				if(x > arr[mid])
					return firstOcc(arr, mid + 1, high, x);
				else if(x < arr[mid])
					return firstOcc(arr, low, mid - 1, x);
				else
				{
					if(mid == 0 || arr[mid - 1] != arr[mid]) //mid==0 means it is first element
						return mid;
					else
						return firstOcc(arr, low, mid - 1, x);
				}
			}

			public static void main(String args[]) 
		    {
		        int arr[] = {5, 10, 10, 15, 20, 20, 20}, n = 7;

				int x = 20;
				
				System.out.println(firstOcc(arr, 0, n - 1, x));


		    } 

		

	
}


//if mid is x, chk its prevois no, if they are equal, call again the function
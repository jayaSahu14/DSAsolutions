package DataStructures.Arrays;

public class ReverseArr {

	    static void reverse(int arr[], int n)
	    {
	    	int low = 0, high = n - 1;

	    	while(low < high)
	    	{
	    		int temp = arr[low];

	    		arr[low] = arr[high];

	    		arr[high] = temp;

	    		low++;
	    		high--;
	    	}
	    }

	    public static void main(String args[]) 
	    { 
	       int arr[] = {10, 5, 7, 30}, n = 4;

	       System.out.println("Before Reverse");

	       for(int i = 0; i < n; i++)
	       {
	       		System.out.print(arr[i]+" ");
	       }

	       System.out.println();

	       reverse(arr, n);

	       System.out.println("After Reverse");

	       for(int i = 0; i < n; i++)
	       {
	       		System.out.print(arr[i]+" ");
	       }

	       int  []arr3= new int[6];
	       arr3[0]=1;    arr3[1]=3;   arr3[2]=3;
	      System.out.println(arr3.length); 
	       
	       
	    } 

	}


// maintain 2 index, 1st position and last position, an dswap, then increment and decrement
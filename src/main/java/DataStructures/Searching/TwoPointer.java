package DataStructures.Searching;

public class TwoPointer {

		 public static boolean findPair(int arr[], int size, int x) {
			int i=0,j=size-1;
			while(i<j) {
				if(arr[i]+arr[j]==x) {return true;}
				else  {
					if (arr[i]+arr[j] > x) 
					{j=j-1;}
			       else {i=i+1;}
					}}
			return false;
		 }
		 

		 public static void main(String args[]) 
		    {
				int arr[] = {5, 10, 11, 12, 20, 12}, n = 6;
		        System.out.println(findPair(arr, n, 6));
		    } 

}

//time -O(n) , aux space O(1)
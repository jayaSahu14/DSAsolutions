package DataStructures.Arrays.Basic;

import java.util.Arrays;

public class ChkForSorted {
	
	public static boolean isSorted(int arr[], int size) {
		boolean flag=false;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1])                                  //arr[i-1]>arr[i]
				{flag= false; break;}
			else flag= true;
		}
		return flag;
	}
	

	public static void main(String[] args) {
		 int arr[]={5,20,25,30,15};
	     System.out.println(isSorted(arr, 5));
	     System.out.println("------------");
	     int intKey = 22;
	     int intArr[] = { 10, 20, 15, 22, 35 };
	     Arrays.sort(intArr);
	     System.out.println(
	             intKey + " found at index = "
	             + Arrays.binarySearch(intArr, intKey));

	}

}
//big o(n): tc, aux space: const

package DataStructures.question.Arrays;

public class LeftRotate {

	public static int[] leftR(int arr[]) {
		int temp=arr[0];
		for(int i=1; i<arr.length; i++) {
			arr[i-1]=arr[i];
			
		}arr[arr.length-1]=temp;
		return arr;
	}

		public static void  main(String args[]) 
		{  		 
		 int arr1[]={1,2,3,4,5};
		int arr2[]= leftR(arr1);
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]);
		}}}
 
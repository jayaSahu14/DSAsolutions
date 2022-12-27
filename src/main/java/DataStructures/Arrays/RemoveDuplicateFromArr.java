package DataStructures.Arrays;

import ch.qos.logback.core.joran.sanity.Pair;

//import javafx.util.Pair;
public class RemoveDuplicateFromArr {

	public static int [] intRemoveDuplicate(int arr[], int size) {
		
		int res=1; 
		for(int i=0; i<size; i++) {
			if(arr[i]!= arr[res-1])
			{
				arr[res]=arr[i];
				res++;
			}
		}
		System.out.println(res);
		return arr;
		
		
	}
	
	
	 public static void  main(String args[]) 
	    {  
		 
		 int arr1[]={5,5,8,20,15,15,15,16};
		int arr2[]= intRemoveDuplicate(arr1,8);
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]);
		}
		 
		 
		 
		 
		 
	 }
}

package DataStructures.Arrays;

import java.util.Arrays;

public class LargestInArray {
	
	
	 public static int larges(int arr[]) { 
		 
		 int res=arr[0];
		 for(int i=0;i<arr.length; i++) {
		//Arrays.sort(arr);
			 if(res<arr[i])
				 res=arr[i];
		 } return res;
		 
		 // fix 1st value to res, then compare it with all element, if less than switch
		 
		 
	 }
	 
	 
	 static int secondlargest(int a[],int size)
	 {
	     int largest=0;
	     int res=-1;
	     
	     for(int i=1;i<size;i++)
	     {
	         if(a[i]>a[largest])
	         {
	             res=largest;
	             largest=i;
	         }
	         else if(a[i]!=a[largest])
	         {
	             if(res==-1||a[i]>a[res])
	             res=i;
	         }
	     }
	     return res;
	 }
	 
	 public static void secLarg(int arr[], int n) {  
		 
		 int res=-1, largest=0;
		 for(int i=0;i<arr.length; i++) {
			 if(arr[i]>arr[largest])
			 {
				 res=arr[largest];
				largest=arr[i];
				
				 
			 }
			 System.out.println(res);
		 }
		 
		 
	 }
	 
	 

	public static void main(String[] args) {
		 int arr[]={5,8,20,15};
	     System.out.println(larges(arr));
	     
	     System.out.println(secondlargest(arr,4));
	     secLarg(arr,4);

	}

}

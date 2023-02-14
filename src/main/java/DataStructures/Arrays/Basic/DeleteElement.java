package DataStructures.Arrays.Basic;

public class DeleteElement {
	
	public static int delElement(int arr[], int size, int x) {
		int i=0;
		for( i=0; i<size; i++) {
			if(arr[i]==x) break;  //find the element to be deleted
		}
		
		if(i==size)return size; // element not present
		
		for(int  j=i;  j<size-1; j++) {
			arr[j]= arr[j+1];
		}
		return size-1;
	}
	
	public static void main(String args[]) 
    { 
       int arr[] = {3, 8, 12, 5, 6}, x = 12, size = 5;
       System.out.println("Before Deletion");
       for(int i=0; i < size; i++) {System.out.print(arr[i]+" ");}

       System.out.println();
       
       size = delElement(arr, size, x);
       System.out.println("After Deletion");
       for(int i=0; i < size; i++) {System.out.print(arr[i]+" ");}

}}

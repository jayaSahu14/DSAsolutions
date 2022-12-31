package DataStructures.Sorting;

public class NaivePartition {
	
	public static void main (String[] args) 
    {
        int arr[] = new int[]{5,13,6,9,12,11,8};
        
        int n = arr.length;
        partition(arr,0,n-1,9);
        
	    for(int x: arr)
	        System.out.print(x+" ");
        
    }
    
    static int[] partition(int arr[], int l, int h, int p)
    {
          int temp[]=new int[h-l+1];
          int j=0;
          for(int i=0;i<p;i++) {
        	 temp[j]=arr[i]; j++; 
          }      
          temp[j++] = arr[p];
          int k=j+1;
          for(int i=p+1;i<h;i++) {
         	 temp[k]=arr[i]; k++; 
           }
        
          for(int i2=0;i2<temp.length;i2++) 
          {
        	  arr[i2]=temp[i2];          }
		return temp;
          
          
}
    
}

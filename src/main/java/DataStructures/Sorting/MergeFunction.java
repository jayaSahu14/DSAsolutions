package DataStructures.Sorting;

public class MergeFunction {	
	
	 static void merge1(int arr[], int low, int mid, int high){
		    
	        int n1=mid-low+1, n2=high-mid;
	        int[] left=new int[n1];
	        int[]right=new int[n2];
	        for(int i=0;i<n1;i++)
	            left[i]=arr[i+low]; //copy 1st half into left array.....and low may not be 0 , so add low
	        for(int j=0;j<n2;j++)
	            right[j]=arr[mid+1+j];    
	        
	        int i=0,j=0,k=low;
	        while(i<n1 && j<n2){
	            if(left[i]<=right[j])
	                arr[k++]=left[i++];
	            else
	                arr[k++]=right[j++];
	        }
	        while(i<n1)
	            arr[k++]=left[i++];
	        while(j<n2)
	            arr[k++]=right[j++];    
	    }
	
	 public static void main (String[] args) 
	    {
	        int a[] = new int[]{10,15,20,40,8,11,15,22,25};  //10 15 20 40 8 11 15 22 10 15 20 40 8 11 15 22 25 
		    int l=0,h=8,m=3;
	        
	        merge1(a,l,m,h);
		    for(int x: a)
		        System.out.print(x+" ");
	        
	    }
	}

//copy elements into distinct array, use merge2sort function, and paste in original array
// tc, aux space : theta (n), 
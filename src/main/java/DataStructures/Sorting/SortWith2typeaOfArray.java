package DataStructures.Sorting;

public class SortWith2typeaOfArray {

	    public static void main (String[] args) 
	    {
	        int arr[] = new int[]{13,-12,18,-10};        
	        int n = arr.length;        
	        sort(arr,n);		
		    for(int x:arr)
	            System.out.print(x+" ");
	        
	    }
	    
	    static void sort(int arr[],int n){
	        int[] temp=new int[n];
	        int i=0;
	        
	        for(int j=0;j<n;j++)
	            if(arr[j]<0)
	                temp[i++]=arr[j]; // -ve in temp
	        for(int j=0;j<n;j++)
	            if(arr[j]>=0)
	                temp[i++]=arr[j]; // +ve in temp
	        for(int j=0;j<n;j++)
	            arr[j]=temp[j];	// temp to arr
	    }
	    
	    static void eff(int arr[],int n){
	        int i=-1,j=n;
	        while(true)
	        {
	            do{i++;}while(arr[i]<0);
	            do{j--;}while(arr[j]>=0);
	            if(i>=j)return;
	            
	            //swapping arr[i] & arr[j]
	            int temp=arr[i];
	            arr[i]=arr[j];
	            arr[j]=temp;
	            
	        }
	    }
	     }
	


package DataStructures.Arrays.Basic;

public class Insert {
	 public void insertAtIndex(int arr[],int sizeOfArray,int index,int element)
	    {
	        if(index==sizeOfArray-1){
	            arr[sizeOfArray-1]= element;
	        }
	        else
	        for(int i=sizeOfArray-1;i>index;i--){
	            arr[i]=arr[i-1];
	        }
	        arr[index]=element;
	    }
}

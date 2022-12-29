package DataStructures.Arrays;

public class SubarrayWithGivenSum {

	  public  boolean ws(int arr[], int sum)
      {
		  int start=0, curr=0, size=arr.length;
		  for(int end=0; end<size;end++ )
		  {
			  curr+=arr[end];
			  while(sum<curr) { 
				  curr-=arr[start];
				  start++;
			  }
			  if(curr==sum) 
				  return true;
			  }
			  return false;
		  }		  	  
      }
	
//time: 0[n], aux, O(10

package DataStructures.Hashing;

import java.util.Arrays;

public class LinearProboing {
	
	 int[] linearProbing(int hash_size, int arr[], int sizeOfArray)
	   {
	     int[] hash = new int[hash_size];
	       Arrays.fill(hash, -1);
	       for (int i = 0; i < sizeOfArray; i++){
	           
	          int k=(arr[i]%hash_size);
	          int p=k;
	          int x=1;
	          while(hash[k]!=-1&&hash[k]!=arr[i])
	          {
	              k=(arr[i]+x)%hash_size;
	              x++;
	              if(k==p)
	                  break;
	          }
	          if(hash[k]==-1)
	          {
	              hash[k]=arr[i];
	          }
	       }
	       return hash;
	   }
	 
	 
	  static void quadraticProbing(int[] hash, int hash_size, int arr[], int N)
	    {
	        
	         int size=0;

	        for(int i=0;i<hash_size;i++)

	        {

	            hash[i]=-1;

	        }

	        for(int i=0;i<N;i++)

	        {

	            int k=arr[i]%hash_size;

	            if(size==hash_size)

	            break;

	            int x=1;

	            while(hash[k]!=-1 && hash[k]!=2 && hash[k]!=arr[i])

	            {

	                k=(arr[i]+(x*x))%hash_size;

	                x++;

	            }

	            if(hash[k]==arr[i])

	            continue;

	            else

	            {

	                hash[k]=arr[i];

	                size++;

	            }

	            

	        }
	        //Your code here
	    }

}

package DataStructures.Arrays;

public class FreqInSortedArr {

	static void printFreq(int arr[], int size) {
		
		int freq=1, i=1;
		while(i<size) {
			while(i < size && arr[i]==arr[i-1]) {
				freq++; i++;   // increase freq and i untill it and prev are equal
			}
			System.out.println(arr[i - 1] + " " + freq);
			i++;
    		freq = 1;
    	}
    	if(size==1 || arr[size-1]!=arr[size-2])
    	System.out.println(arr[size-1]+" "+ 1) ;
    }


    public static void main(String args[]) 
    { 
       int arr[] = {10, 10, 20, 30, 30, 30}, n = 6;

       printFreq(arr, n);

    } 

}

// start from i =1, see if its prev ==i, yes, then increase freq by i, if no, print prev and freq, 
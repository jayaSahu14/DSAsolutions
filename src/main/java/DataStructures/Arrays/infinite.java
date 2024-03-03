package DataStructures.Arrays;

public class infinite {
                
	static int search(int arr[], int x)
	{
		if(arr[0]==x) return 0;
		int i=1;
		while(arr[i]<x) {
			i=i*2;
		}
		if(arr[i]==x) { return arr[i];}
		else {	bsearch(arr, 1+i/2,i-1,x);}
		}
	
}

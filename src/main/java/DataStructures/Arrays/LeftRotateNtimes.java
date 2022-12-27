package DataStructures.Arrays;

public class LeftRotateNtimes {

/*1st method: left rotate, and call it n times	|| theta(n* m), aux space: theta 1
	
2nd method: efficien method: copy d elements in temp array, than rotate left remainig elements by d position, 
then copy the temp arr elements at back, tc theta(n), theta(d) aux space,
	
	 reversal methid , 1st: reverse d elements, reverse remaining elements, reverse all
 1,2,3,4,5,6
 2,1,3,4,5,6
 2,1,6,5,4,3
3,4,5,6,1,2  */
	

    static void leftRotate(int arr[], int d, int n)
    {
    	reverse(arr, 0, d - 1);

    	reverse(arr, d, n - 1);

    	reverse(arr, 0, n - 1);

    }

    static void reverse(int arr[], int low, int high)
    {
    	while(low < high)
    	{
    		int temp = arr[low];
    		arr[low] = arr[high];
    		arr[high] = temp;

    		low++;
    		high--;
    	}
    }

    public static void main(String args[]) 
    { 
       int arr[] = {1, 2, 3, 4, 5}, n = 5, d = 2;

       System.out.println("Before Rotation");

       for(int i = 0; i < n; i++)
       {
       		System.out.print(arr[i]+" ");
       }

       System.out.println();

       leftRotate(arr, d, n);

       System.out.println("After Rotation");

       for(int i = 0; i < n; i++)
       {
       		System.out.print(arr[i]+" ");
       }

    } 

}
	
	
	
	
	


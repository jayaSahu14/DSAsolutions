package DataStructures.Arrays.Basic;

import java.util.Arrays;

public class PrintRepeatingElements {
	
	static void printDistinct(int arr[], int n)
    {

        for (int i = 0; i < n; i++)
        {
            int j;
            for (j = 0; j < i; j++)
            if (arr[i] == arr[j])
                break;
            if (i == j)
            System.out.print( arr[i] + " ");
        }}

        static void printDistinct1(int arr[], int n)
        {
             Arrays.sort(arr);
         
            for (int i = 0; i < n; i++)
            {
                   while (i < n - 1 && arr[i] == arr[i + 1])
                    i++;
                System.out.print(arr[i] +" ");
            }
        }
        
 //--------------------------------------------------------------------------------------------------------s
        
        void printRepeating1(int arr[], int size)
    	{
    		int i, j;
    		System.out.print("Repeating Elements are ");
    		for (i = 0; i < size - 1; i++) {
    			for (j = i + 1; j < size; j++) {
    				if (arr[i] == arr[j])
    					System.out.print(arr[i] + " ");
    			}
    		}
    	}
        
        void printRepeating(int arr[], int size)
        {
            int count[] = new int[size];
            int i;
     
            System.out.print("Repeating elements are ");
            for (i = 0; i < size; i++) {
                if (count[arr[i]] == 1)
                    System.out.print(arr[i] + " ");
                else
                    count[arr[i]]++;
            }
        }
    
    
    
    
    
    
    
    
    
    }
	

}

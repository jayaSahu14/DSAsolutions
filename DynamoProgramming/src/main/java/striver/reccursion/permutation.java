package striver.reccursion;

import java.util.*;
public class permutation {

	    public List<List<Integer>> permute(int[] nums) {
	        List<List<Integer>> ans = new ArrayList<>();
	        Arrays.sort(nums);
	        find(nums, nums.length, 0, ans);
	        return ans;
	    }
	    
	    public static void find(int[] arr, int n, int ind, List<List<Integer>> ans){
	        if(ind == n){
	            List<Integer> ds = new ArrayList<>();
	            for(int it : arr){
	                ds.add(it);
	            }
	            ans.add(ds);
	            return;
	        }
	        
	        for(int i=ind; i<n;i++){
	            swap(arr, i, ind);
	            find(arr, n, ind+1, ans);
	            swap(arr, i, ind);
	        }
	    }
	    public static void swap(int[] arr, int si, int ei){
	        int t = arr[si];
	        arr[si] = arr[ei];
	        arr[ei] = t;
	    }
	}


/*  // Java program to print all permutations of a
//given string.
public class Permutation
{
	public static void main(String[] args)
	{
		String str = "ABC";
		int n = str.length();
		permute(str, 0);
	}

	static void permute(String str, int i)
	{
		if (i == str.length()-1)
			System.out.println(str);
		else
		{
			for (int j = i; j <= str.length()-1; j++)
			{
				str = swap(str,i,j);
				permute(str, i+1);
				str = swap(str,i,j);
			}
		}
	}

	static String swap(String a, int i, int j)
	{
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i] ;
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

}

*/
package DataStructures.recursion;

import java.util.ArrayList;
import java.util.HashMap;

public class PossibleWords {


	//User function Template for Java

	class Solution
	{
	    //Function to find list of all words possible by pressing given numbers.
	    static ArrayList <String> possibleWords(int arr[], int n)
	    {
	        ArrayList <String> ans =  new ArrayList<>();
	        
	         HashMap<Integer , String > map = new HashMap<>();
	         map.put(2,"abc");
	         map.put(3,"def");
	         map.put(4,"ghi");
	         map.put(5,"jkl");
	         map.put(6,"mno");
	         map.put(7,"pqrs");
	         map.put(8,"tuv");
	         map.put(9,"wxyz");
	         fun(arr, ans , "" , map , 0 , n);
	         return ans;
	         
	    }
	    static void fun(int[] arr ,ArrayList <String> ans , String s , HashMap<Integer , String > map , int ind , int n)
	    {
	        if(s.length() == n) 
	        {
	            ans.add(new String(s));
	            return ;
	        }
	        
	        for(int i = ind ; i < arr.length ; i++)
	        {
	            if(arr[i] != 7 && arr[i] != 9)
	            {
	                s += String.valueOf(map.get(arr[i]).charAt(0));
	                fun(arr,ans , s , map , i+1 , n);
	                s = s.substring (0 , s.length()- 1 );
	                s += String.valueOf(map.get(arr[i]).charAt(1));
	                fun(arr,ans , s , map , i+1 , n);
	                s = s.substring (0 , s.length()- 1 );
	                s +=  String.valueOf(map.get(arr[i]).charAt(2));
	                fun(arr, ans , s, map , i+1 , n);
	                s = s.substring (0 , s.length()- 1 );
	                
	                
	            }
	            
	            else 
	            {
	                s +=  String.valueOf(map.get(arr[i]).charAt(0));
	                fun(arr,ans , s, map , i+1 , n);
	                s = s.substring (0 , s.length()- 1 );
	                
	                s += String.valueOf(map.get(arr[i]).charAt(1));
	                fun(arr,ans , s, map , i+1 , n);
	                s = s.substring (0 , s.length()- 1 );
	                
	                s += String.valueOf(map.get(arr[i]).charAt(2));
	                fun(arr,ans , s, map , i+1 , n);
	                s = s.substring (0 , s.length()- 1 );
	                
	                 s += String.valueOf(map.get(arr[i]).charAt(3));
	                 fun(arr,ans ,s, map , i+1 , n);
	                  s = s.substring (0 , s.length()- 1 );
	            }
	        }
	    }
	        
	        
	}

}

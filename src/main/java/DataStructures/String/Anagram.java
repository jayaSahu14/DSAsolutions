package DataStructures.String;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

	    static final int CHAR=256;
	        
	    static boolean areAnagram(String s1, String s2) 
	    { 
	       
	        if (s1.length() != s2.length()) 
	            return false; 
	  
	       int[] count=new int[CHAR];
	    for(int i=0;i<s1.length();i++){
	        count[s1.charAt(i)]++;
	        count[s2.charAt(i)]--;
	    }
	    
	    for(int i=0;i<CHAR;i++){
	        if(count[i]!=0)return false;
	    }
	    return true;
	    
	    } 




    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> count = new HashMap<>();
        
        // Count the frequency of characters in string s
        for (char x : s.toCharArray()) {
            count.put(x, count.getOrDefault(x, 0) + 1);
        }
        
        // Decrement the frequency of characters in string t
        for (char x : t.toCharArray()) {
            count.put(x, count.getOrDefault(x, 0) - 1);
        }
        
        // Check if any character has non-zero frequency
        for (int val : count.values()) {
            if (val != 0) {
                return false;
            }
        }
        
        return true;
    }
}










	  
	    /*  make arr of 256 , then for every char of string 1, go at arr and increment its place, and for strin2, decrese its val 
	    
	    public static void main(String args[]) 
	    { 
	        String str1 = "abaac"; 
	        String str2 = "aacba";  
	        if (areAnagram(str1, str2)) 
	            System.out.println("The two strings are"
	                               + " anagram of each other"); 
	        else
	            System.out.println("The two strings are not"
	                               + " anagram of each other"); 
	    } 
	} 

/* static boolean areAnagram(String s1, String s2) 
{ 

if (s1.length() != s2.length()) 
    return false; 

char a1[]=s1.toCharArray();
Arrays.sort(a1);
s1=new String(a1);
char a2[]=s2.toCharArray();
Arrays.sort(a2);
s2=new String(a2);

return s1.equals(s2);
} 
*/
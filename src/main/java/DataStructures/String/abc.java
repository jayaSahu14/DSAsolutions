package DataStructures.String;

import java.util.*;
import java.io.*;
import java.lang.*;


public class abc {
	
	public class StringFormatter {  
		public static String reverseString(String str){  
		    StringBuilder sb=new StringBuilder(str);  
		    sb.reverse();  
		    return sb.toString();  
		}


	 public static void main(String[] args){
	    String str="geeksforgeeks";
	    int[] count=new int[26];
	    for(int i=0;i<str.length();i++){
	        count[str.charAt(i)-'a']++;
	    }
	    for(int i=0;i<26;i++){
	        if(count[i]>0){
	            System.out.println((char)(i+'a')+" "+count[i]);
	        }
	    }
	    
	    char ch='d'-'a';
    	int castAscii = (int) ch; System.out.println(castAscii);
 	
    	  System.out.println(StringFormatter.reverseString("my name is khan"));  
    	    System.out.println(StringFormatter.reverseString("I am sonoo jaiswal"));      
	}
	}} 
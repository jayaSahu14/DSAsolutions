package Exam;

import java.util.ArrayList;
import java.util.Collections;

public class g1 {

	 public  static int uniquePositions(String moves){
	       
	       ArrayList<Integer> arr= new ArrayList<Integer>();
	       int p=1;
	       for(int i=0;i<moves.length();i++){
	           if(moves.charAt(i)=='F' ){
	               p++; arr.add(p);
	           } else if(moves.charAt(i)=='B' )
	           {p--; arr.add(p);}
	       } 
	       Integer s=Collections.max(arr);
	       System.out.println(arr);
	       int j=s.intValue();
	       return j+1;
	        
	    }
	 
	 public static void main(String[] args) {
		String m= "BFFBBFFBFBBFBBBFFBFF";
		uniquePositions(m);
	 
	 }
}
